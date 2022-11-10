package com.masai.dao;

import java.util.List;

import com.masai.models.Buyer;
import com.masai.models.Seller;

public interface AdministratorDao {
	public List<Buyer> registeredBuyerList();
	public List<Seller> registeredSellerList();
	public String dailyDisputeReport();
	public String dailySellingReport();
	public boolean disputeReport();
}
