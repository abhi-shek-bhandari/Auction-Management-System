package com.masai.usecase.buyer;
import java.util.List;
import com.masai.dao.BuyerDao;
import com.masai.dao.BuyerDaoImpl;
import com.masai.exceptions.BuyerException;
import com.masai.models.Buyer;

public class SelectAndViewAllBuyers {
	 public static void main(String[] args) throws BuyerException{
		 BuyerDao buyer = new BuyerDaoImpl();
		 List<Buyer> list = buyer.selectAndViewAllBuyers();
		 if(list.size()>0) list.forEach(s-> System.out.println(s.toString()));
		 else System.out.println("No Buyer Details Founded");
	 }
}
