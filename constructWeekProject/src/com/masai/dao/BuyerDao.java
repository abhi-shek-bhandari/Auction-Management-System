package com.masai.dao;

import java.util.List;

import com.masai.exceptions.BuyerException;
import com.masai.models.Buyer;
import com.masai.models.Product;

public interface BuyerDao {
	public String registerBuyer(Buyer buyer)throws BuyerException;
	public List<Product> searchAndViewusingCategory(String Category)throws BuyerException;               
	public List<Buyer> selectAndViewAllBuyers()throws BuyerException;
	public List<Product> selectItemsToBuy()throws BuyerException;
}
