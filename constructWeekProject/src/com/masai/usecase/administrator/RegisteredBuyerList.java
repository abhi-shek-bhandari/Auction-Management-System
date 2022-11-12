package com.masai.usecase.administrator;

import java.util.List;

import com.masai.dao.AdministratorDao;
import com.masai.dao.AdministratorDaoImpl;
import com.masai.exceptions.AdministratorException;
import com.masai.models.Buyer;

public class RegisteredBuyerList {
	public static void main(String[] args) {
		AdministratorDao admin = new AdministratorDaoImpl();
		List<Buyer> buyer = null;
		try {
			buyer = admin.registeredBuyerList();
		} catch (AdministratorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(buyer.isEmpty()) System.out.println("No Buyer Founded");
		else buyer.forEach(s -> System.out.println(s));
	}
}
