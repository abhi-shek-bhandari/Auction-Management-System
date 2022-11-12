package com.masai.usecase.seller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import com.masai.dao.SellerDao;
import com.masai.dao.SellerDaoImpl;

public class RemoveItem {
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
		System.out.println("Enter the Seller Id");
		int sellerId = fs.nextInt();
		System.out.println("Enter the Product Id");
		int productId = fs.nextInt();
		SellerDao seller = new SellerDaoImpl();
		String message = seller.removeItem(sellerId, productId);
		System.out.println("\n"+message);
	}
}
