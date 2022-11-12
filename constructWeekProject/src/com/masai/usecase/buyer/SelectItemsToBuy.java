package com.masai.usecase.buyer;

import java.util.List;

import com.masai.dao.BuyerDao;
import com.masai.dao.BuyerDaoImpl;
import com.masai.exceptions.BuyerException;
import com.masai.models.Product;

public class SelectItemsToBuy {
	public static void main(String[] args) throws BuyerException {
		BuyerDao buyer = new BuyerDaoImpl();
		List<Product> list = buyer.selectItemsToBuy();
		if(!list.isEmpty()) list.forEach(s-> System.out.println(s));
		else System.out.println("No Item Founded");
	}
}
