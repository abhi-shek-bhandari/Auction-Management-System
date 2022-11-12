package com.masai.usecase.buyer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.StringTokenizer;

import com.masai.dao.BuyerDao;
import com.masai.dao.BuyerDaoImpl;
import com.masai.exceptions.BuyerException;
import com.masai.models.Product;

public class SearchAndViewusingCategory {
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
	 public static void main(String[] args) throws BuyerException{
		 FastReader fs = new FastReader();
		 System.out.println("Enter your Category of Products");
		 String category = fs.next();
		 BuyerDao buyer = new BuyerDaoImpl();
		 List<Product> list = buyer.searchAndViewusingCategory(category);
		 if(list.size()>0) list.forEach(s-> System.out.println(s.toString()));
		 else System.out.println("No Item Founded");
	 }
}
