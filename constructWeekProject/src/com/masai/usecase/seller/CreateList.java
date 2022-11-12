package com.masai.usecase.seller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.StringTokenizer;

import com.masai.dao.SellerDao;
import com.masai.dao.SellerDaoImpl;
import com.masai.exceptions.SellerException;
import com.masai.models.Product;

public class CreateList {
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
	 public static void main(String[] args) throws SellerException{
		 FastReader fs = new FastReader();
		 System.out.println("Enter your Seller Id");
		 int sellerid = fs.nextInt();
		 SellerDao seller = new SellerDaoImpl();
		 List<Product> list = seller.createList(sellerid);
		 list.forEach(s-> System.out.println(s.toString()));
	 }
}
