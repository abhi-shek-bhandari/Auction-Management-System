package com.masai.usecase.administrator;

import com.masai.dao.AdministratorDao;
import com.masai.dao.AdministratorDaoImpl;
import com.masai.exceptions.AdministratorException;

public class DisputeReport {
	public static void main(String[] args) {
		AdministratorDao admin = new AdministratorDaoImpl();
		try {
			if(admin.disputeReport()) {
				System.out.println("All Disputes will be Resolved Very Soon");
			}
			else {
				System.out.println("All Disputes are Pending...");
			}
		} catch (AdministratorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
