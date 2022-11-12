package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.exceptions.BuyerException;
import com.masai.models.Buyer;
import com.masai.models.Product;
import com.masai.utility.DButil;

public class BuyerDaoImpl implements BuyerDao{

	@Override
	public String registerBuyer(Buyer buyer)throws BuyerException {
		// TODO Auto-generated method stub
		String Message = "Not Registered...";
		try(Connection conn = DButil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("insert into buyer values(?,?,?,?,?,?,?,?,?,?,?);");
			ps.setString(1, buyer.getFirstName());
			ps.setString(2, buyer.getLastName());
			ps.setString(3, buyer.getEmail());
			ps.setString(4, buyer.getUsername());
			ps.setString(5, buyer.getPassword());
			ps.setString(6, buyer.getGender());
			ps.setString(7, buyer.getState());
			ps.setString(8, buyer.getCity());
			ps.setInt(9, buyer.getBuyerId());
			ps.setInt(10, buyer.getPincode());
			ps.setString(11, buyer.getPhone());
			int x = ps.executeUpdate();
			if(x>0) Message = "Registered Successfully...";
		} catch (SQLException e) {
			// TODO: handle exception
			Message = e.getMessage();
		}
		return Message;
	}

	@Override
	public List<Product> searchAndViewusingCategory(String Category)throws BuyerException {
		// TODO Auto-generated method stub
		List<Product> products = new ArrayList<>();
		try(Connection conn = DButil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM product WHERE category = ?");
			ps.setString(1, Category);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Product p = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getString(7));
				products.add(p);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			throw new BuyerException(e.getMessage());
		}
		return products;
	}

	@Override
	public List<Buyer> selectAndViewAllBuyers()throws BuyerException {
		// TODO Auto-generated method stub
		List<Buyer> buyers = new ArrayList<>();
		try(Connection conn = DButil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM buyer;");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Buyer b = new Buyer(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getInt(9),rs.getInt(10),rs.getString(11));                        
				buyers.add(b);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			throw new BuyerException(e.getMessage());
		}
		return buyers;
	}

	@Override
	public List<Product> selectItemsToBuy()throws BuyerException {
		// TODO Auto-generated method stub
		List<Product> product = new ArrayList<>();
		try(Connection conn = DButil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM product;");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Product b = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getString(7));                        
				product.add(b);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			throw new BuyerException(e.getMessage());
		}
		return product;
	}
	
}
