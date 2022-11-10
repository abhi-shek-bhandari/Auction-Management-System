package com.masai.dao;

import java.util.List;

import com.masai.models.Product;
import com.masai.models.Seller;

public interface SellerDao {
	public String sellerRegister(Seller seller);
	public List<Product> createList(Seller seller);
	public String updatePriceQuantityofItem(int ProductId, int Price, int Quantity);
	public String addItem(Product product);
	public String removeItems(Seller seller,List<Integer> ProductIds);
	public String soldItemHistory(Seller seller,int ProductId);
}
