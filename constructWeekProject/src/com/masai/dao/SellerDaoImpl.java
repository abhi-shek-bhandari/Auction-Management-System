package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.exceptions.ProductException;
import com.masai.exceptions.SellerException;
import com.masai.models.Product;
import com.masai.models.Seller;
import com.masai.utility.DButil;

public class SellerDaoImpl implements SellerDao{

	@Override
	public String sellerRegister(Seller seller) {
		// TODO Auto-generated method stub
		String message = "Not Registered";
		try (Connection conn = DButil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("insert into seller values(?,?,?,?,?,?,?,?,?,?,?,?);");
			ps.setString(1, seller.getFirstName());
			ps.setString(2, seller.getLastName());
			ps.setString(3, seller.getEmail());
			ps.setString(4, seller.getUsername());
			ps.setString(5, seller.getPassword());
			ps.setString(6, seller.getGender());
			ps.setString(7, seller.getCompanyName());
			ps.setString(8, seller.getState());
			ps.setString(9, seller.getCity());
			ps.setInt(10, seller.getSellerId());
			ps.setInt(11, seller.getPincode());
			ps.setString(12, seller.getPhone());
			int x = ps.executeUpdate();
			if(x>0) message = "Registered";
		} catch (SQLException e) {
			message = e.getMessage();
		}	
		return message;
	}

	@Override
	public List<Product> createList(int sellerid) throws SellerException {
		// TODO Auto-generated method stub
		List<Product> products = new ArrayList<>();
		try (Connection conn = DButil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("select * from product WHERE sellerid = ?");
			ps.setInt(1, sellerid);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Product p = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getString(7));
				products.add(p);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			throw new SellerException(e.getMessage());
		}
		return products;
	}

	@Override
	public String updatePriceQuantityofItem(int ProductId, int Price, int Quantity)throws ProductException {
		String message = "Not updated..";
		try(Connection conn = DButil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("update product set quantity = ?, price = ? WHERE productid=?");
			ps.setInt(1, Quantity);
			ps.setInt(2, Price);
			ps.setInt(3, ProductId);
			int rs = ps.executeUpdate();
			if(rs>0) message = "Updated";
		}catch(SQLException e) {
			throw new ProductException(e.getMessage());
		}
		return message;
	}

	@Override
	public String addItem(int sellerid,Product product) {
		String message = "Product Not Added";
		try(Connection conn = DButil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("insert into product values(?,?,?,?,?,?,?)");
			ps.setInt(1, product.getProductId());
			ps.setString(2,product.getProductName());
			ps.setInt(3, product.getPrice());
			ps.setInt(4, product.getQuantity());
			ps.setInt(5, sellerid);
			ps.setInt(6, product.getSold());
			ps.setString(7, product.getCategory());
			int x = ps.executeUpdate();
			if(x>0) message = "Product Added SuccessFully";
		}
		catch(SQLException e){
			message = e.getMessage();
		}
		return message;
	}

	@Override
	public String removeItem(int sellerId, int ProductIds) {
		// TODO Auto-generated method stub
		String message = "Product Not Deleted";
		
		try(Connection conn = DButil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("DELETE FROM product WHERE productid = ? AND sellerid = ?");
			ps.setInt(1, ProductIds);
			ps.setInt(2, sellerId);
			int rs = ps.executeUpdate();
			if(rs>0) message = "Product Deleted";
		}
		catch(SQLException e) {
			message = e.getMessage();
		}
		return message;
	}

	@Override
	public String soldItemHistory(int sellerId, int ProductId) {
		// TODO Auto-generated method stub
		String message = "Item Not Found";
		try(Connection conn = DButil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM product WHERE productid = ? AND sellerid = ?");
			ps.setInt(1, ProductId);
			ps.setInt(2, sellerId);
			ResultSet rs = ps.executeQuery();
			rs.next();
			String productName = rs.getString(2);
			int times = rs.getInt(6);
			if(times>-1) message = "Product "+productName+" sold "+times+" Times";
		}
		catch(SQLException e) {
			message = e.getMessage();
		}
		return message;
	}

}
