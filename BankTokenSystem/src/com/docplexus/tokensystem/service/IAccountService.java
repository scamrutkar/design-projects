package com.docplexus.tokensystem.service;

import com.docplexus.tokensystem.model.User;

public interface IAccountService {
	
	User getUserAccountByMobileId(long mobileNo);
	
	User getUserAccountByEmailId(String emailId);

}
