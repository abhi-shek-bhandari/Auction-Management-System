package com.masai.dao;

import java.util.List;

import com.masai.exceptions.AdministratorException;
import com.masai.models.Buyer;
import com.masai.models.Seller;

public interface AdministratorDao {
	public List<Buyer> registeredBuyerList()throws AdministratorException;
	public List<Seller> registeredSellerList()throws AdministratorException;
	public String dailyDisputeReport()throws AdministratorException;
	public String dailySellingReport()throws AdministratorException;
	public boolean disputeReport()throws AdministratorException;
}
