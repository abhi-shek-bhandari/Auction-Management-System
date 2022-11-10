package com.masai.dao;

import java.util.List;

import com.masai.models.Buyer;
import com.masai.models.Product;

public interface BuyerDao {
	public String registerBuyer(Buyer buyer);
	public List<Product> searchAndViewusingCategory();
	public List<Buyer> selectAndViewAllBuyers();
	public List<Product> selectItemsToBuy();
}
