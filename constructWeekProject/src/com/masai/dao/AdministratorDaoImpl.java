package com.masai.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.masai.exceptions.AdministratorException;
import com.masai.models.Buyer;
import com.masai.models.Seller;
import com.masai.utility.DButil;

public class AdministratorDaoImpl implements AdministratorDao{

	@Override
	public List<Buyer> registeredBuyerList() throws AdministratorException {
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
			throw new AdministratorException(e.getMessage());
		}
		return buyers;
	}

	@Override
	public List<Seller> registeredSellerList() throws AdministratorException {
		// TODO Auto-generated method stub
		List<Seller> seller = new ArrayList<>();
		try(Connection conn = DButil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM seller;");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				String firstName = rs.getString(1);
				String lastName = rs.getString(2);
				String email = rs.getString(3);
				String username = rs.getString(4);
				String password = rs.getString(5);
				String gender = rs.getString(6);
				String companyName = rs.getString(7);
				String State = rs.getString(8);
				String City = rs.getString(9);
				int SellerId = rs.getInt(10);
				int pincode = rs.getInt(11);
				String phone = rs.getString(12);
				Seller s = new Seller(firstName, lastName, email, username, password, gender, companyName, State, City, SellerId, pincode,phone);                        
				seller.add(s);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			throw new AdministratorException(e.getMessage());
		}
		return seller;
	}

	@Override
	public String dailyDisputeReport() throws AdministratorException {
		// TODO Auto-generated method stub
		int random = (int)(Math.random()*(300)+1);
		return "Today Total Disputes are "+random;
	}

	@Override
	public String dailySellingReport() throws AdministratorException {
		// TODO Auto-generated method stub
		int random = (int)(Math.random()*(1001)+1);
		return "Total Sell of today are "+random;
	}

	@Override
	public boolean disputeReport() throws AdministratorException {
		// TODO Auto-generated method stub
		System.out.println("Press 1 for Forword all disputes to Moderators to Resolve");
		System.out.println("Press 0 key to Cancel...");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return (n==1)?true:false;
	}

}
