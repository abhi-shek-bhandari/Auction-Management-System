package com.masai.usecase.seller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import com.masai.dao.SellerDao;
import com.masai.dao.SellerDaoImpl;
import com.masai.models.Product;

public class AddItem {
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
	  public static void main(String[] args){
		  FastReader fs = new FastReader();
		  System.out.println("Enter the Product Id");
		  int productId = fs.nextInt();
		  System.out.println("Enter the Product Name");
		  String productName = fs.nextLine();
		  System.out.println("Enter the Product Price");
		  int price = fs.nextInt();
		  System.out.println("Enter the Product Quantity");
		  int quantity = fs.nextInt();
		  System.out.println("Enter the Seller Id");
		  int sellerId = fs.nextInt();
		  System.out.println("Enter the Product sold");
		  int sold = fs.nextInt();
		  System.out.println("Enter the Category Name");
		  String category = fs.nextLine();
		  Product p = new Product(productId, productName, price, quantity, sellerId, sold, category);
		  SellerDao seller = new SellerDaoImpl();
		  String Message = seller.addItem(sellerId, p);
		  System.out.println("\n"+Message);
	  }
}
