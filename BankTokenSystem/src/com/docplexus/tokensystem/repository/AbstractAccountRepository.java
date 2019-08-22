/**
 * 
 */
package com.docplexus.tokensystem.repository;

import java.util.LinkedList;

import com.docplexus.tokensystem.model.Account;

/**
 * @author sagar.amrutkar
 *
 */
public abstract class AbstractAccountRepository {

	public static LinkedList<Account> accountList = new LinkedList<>();;

	static {
		accountList.add(new Account(9673394645L, "scamrutkar@gmail.com", "Sagar", "Amrutkar", false));
		accountList.add(new Account(1234567890L, "vijayjawale@gmail.com", "Vijay", "Jawale", true));
		accountList.add(new Account(9087654321L, "nikhilraskar@gmail.com", "Nikhil	", "Raskar", true));
		accountList.add(new Account(6789054321L, "niteshbansode@gmail.com", "Nitesh", "Bansode", true));
		accountList.add(new Account(7896543210L, "rohitpandit@gmail.com", "Rohit", "Pandit", false));
	}

	public AbstractAccountRepository() {
	}

	/**
	 * @This method returns account  number 
	 * @param MobileNumber
	 * @return Account
	 */
	abstract public Account getAccountByMobileNumber(long mobileNumber);

	/**
	 * @This method returns account object  
	 * @param Email
	 * @return Account
	 */
	abstract public Account getAccountByEmailId(String emailId);

}
