/**
 * 
 */
package com.docplexus.tokensystem.service;

import com.docplexus.tokensystem.model.User;
import com.docplexus.tokensystem.repository.AbstractAccountRepository;
import com.docplexus.tokensystem.repository.MockAccountRepository;

/**
 * @author sagar.amrutkar
 *
 */
public class AccountServiceImpl implements IAccountService{
	
	AbstractAccountRepository accountRepository;
	
	public AccountServiceImpl() {
		accountRepository = new MockAccountRepository();
	}

	@Override
	public User getUserAccountByMobileId(long mobileNumber) {
		return accountRepository.getAccountByMobileNumber(mobileNumber);
	}

	@Override
	public User getUserAccountByEmailId(String emailId) {
		return accountRepository.getAccountByEmailId(emailId);
	}
	
}
