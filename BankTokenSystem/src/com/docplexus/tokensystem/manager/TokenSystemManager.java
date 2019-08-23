/**
 * 
 */
package com.docplexus.tokensystem.manager;

import java.util.Objects;

import com.docplexus.tokensystem.model.Token;
import com.docplexus.tokensystem.model.User;
import com.docplexus.tokensystem.service.AccountServiceImpl;
import com.docplexus.tokensystem.service.IAccountService;
import com.docplexus.tokensystem.service.ITokenService;
import com.docplexus.tokensystem.service.TokenServiceImpl;

/**
 * @author sagar.amrutkar
 *
 */
public class TokenSystemManager implements ITokenSystemManager {

	ITokenService tokenService;
	IAccountService accountService;

	public TokenSystemManager() {
		tokenService = new TokenServiceImpl();
		accountService = new AccountServiceImpl();
	}

	@Override
	public Token genrateToken(long mobileNo) {
		return genrateToken(mobileNo, null);
	}

	@Override
	public Token genrateToken(String emailId) {
		return genrateToken(-1L, emailId);
	}

	@Override
	public Token genrateToken(long mobileNo, String emailId) {

		User user = null;
		if (mobileNo != -1) {
			user = accountService.getUserAccountByMobileId(mobileNo);
			System.out.println("Current User - " + user.toString());
		} else if (!Objects.isNull(emailId)) {
			user = accountService.getUserAccountByEmailId(emailId);
			System.out.println("Current User - " + user.toString());
		} else
			System.out.println("Invalid Data");

		return tokenService.genrateToken(user);

	}
	
	public static void main(String[] args) {
		
		
		
	}
	
	

}
