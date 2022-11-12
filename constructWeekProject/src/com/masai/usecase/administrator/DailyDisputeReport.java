package com.masai.usecase.administrator;

import com.masai.dao.AdministratorDao;
import com.masai.dao.AdministratorDaoImpl;
import com.masai.exceptions.AdministratorException;

public class DailyDisputeReport {
	public static void main(String[] args) {
		String message = null;
		AdministratorDao admin = new AdministratorDaoImpl();
		try {
			message = admin.dailyDisputeReport();
		} catch (AdministratorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(message);
	}
}
