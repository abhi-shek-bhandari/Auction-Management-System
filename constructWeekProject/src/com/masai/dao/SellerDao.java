package com.masai.dao;

import java.util.List;

import com.masai.exceptions.ProductException;
import com.masai.exceptions.SellerException;
import com.masai.models.Product;
import com.masai.models.Seller;

public interface SellerDao {
	public String sellerRegister(Seller seller);
	public List<Product> createList(int sellerid)throws SellerException;
	public String updatePriceQuantityofItem(int ProductId, int Price, int Quantity)throws ProductException;
	public String addItem(int sellerid,Product product);
	public String removeItem(int sellerId,int ProductIds);
	public String soldItemHistory(int sellerId,int ProductId);
}
