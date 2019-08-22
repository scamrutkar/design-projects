package com.docplexus.tokensystem.service;

import java.util.concurrent.atomic.AtomicInteger;

import com.docplexus.tokensystem.model.Token;
import com.docplexus.tokensystem.model.User;

/**
 * @author sagar.amrutkar
 *
 */
public interface ITokenService {
	
	AtomicInteger tokeNumber = new AtomicInteger(1);
	
	public Token genrateToken(User user);

	public void ResetToken();

}
