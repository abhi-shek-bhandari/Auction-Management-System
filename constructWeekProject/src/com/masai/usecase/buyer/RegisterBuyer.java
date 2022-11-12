package com.masai.usecase.buyer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import com.masai.dao.BuyerDao;
import com.masai.dao.BuyerDaoImpl;
import com.masai.models.Buyer;

public class RegisterBuyer {
	static class FastReader{
	    BufferedReader br;
	    StringTokenizer st;
	    public FastReader()
	    {
	      br = new BufferedReader(new InputStreamReader(System.in));
	    }
	    String next()
	    {
	      while (st == null || !st.hasMoreElements()){
	        try { st = new StringTokenizer(br.readLine()); }
	        catch (IOException e) { e.printStackTrace(); }
	      }
	      return st.nextToken();
	    }
	    int nextInt() { return Integer.parseInt(next()); }
	    long nextLong() { return Long.parseLong(next()); }
	    double nextDouble(){ return Double.parseDouble(next()); }
	    String nextLine(){
	      String str = "";
	      try { str = br.readLine(); }
	      catch (IOException e) { e.printStackTrace(); }
	      return str;
	    }
	  }
	public static void main(String[] args) {
		try{
			FastReader fs = new FastReader();
			System.out.println("Enter the FirstName\n");
			String firstName = fs.next();
			System.out.println("Enter the LastName\n");
			String lastName = fs.next();
			System.out.println("Enter the Email\n");
			String email = fs.next();
			System.out.println("Enter the username\n");
			String username = fs.next();
			System.out.println("Enter the password\n");
			String password = fs.next();
			System.out.println("Enter your Gender Male/Female \n");
			String gender = fs.next();
			System.out.println("Enter the State\n");
			String State = fs.next();
			System.out.println("Enter the City\n");
			String City = fs.next();
			System.out.println("Enter BuyerId eg:- 123 onlu Numner allowed\n");
			int BuyerId = fs.nextInt();
			System.out.println("Enter the Pincode of your City\n");
			int pincode = fs.nextInt();
			System.out.println("Enter the Phone Number\n");
			String phone = fs.nextLine();
			Buyer b = new Buyer(firstName, lastName, email, username, password, gender, State, City, BuyerId, pincode,phone);
			BuyerDao buyer = new BuyerDaoImpl();
			String Message = buyer.registerBuyer(b);
			System.out.println(Message);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
