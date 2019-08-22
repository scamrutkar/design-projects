/**
 * 
 */
package com.docplexus.tokensystem.repository;

import java.util.LinkedList;

import com.docplexus.tokensystem.model.User;

/**
 * @author sagar.amrutkar
 *
 */
public abstract class AbstractAccountRepository {

	public static LinkedList<User> accountList = new LinkedList<>();;

	static {
		accountList.add(new User(9673394645L, "scamrutkar@gmail.com", "Sagar", "Amrutkar", false));
		accountList.add(new User(1234567890L, "vijayjawale@gmail.com", "Vijay", "Jawale", true));
		accountList.add(new User(9087654321L, "nikhilraskar@gmail.com", "Nikhil	", "Raskar", true));
		accountList.add(new User(6789054321L, "niteshbansode@gmail.com", "Nitesh", "Bansode", true));
		accountList.add(new User(7896543210L, "rohitpandit@gmail.com", "Rohit", "Pandit", false));
	}

	public AbstractAccountRepository() {
	}

	/**
	 * @This method returns account  number 
	 * @param MobileNumber
	 * @return Account
	 */
	abstract public User getAccountByMobileNumber(long mobileNumber);

	/**
	 * @This method returns account object  
	 * @param Email
	 * @return Account
	 */
	abstract public User getAccountByEmailId(String emailId);

}
