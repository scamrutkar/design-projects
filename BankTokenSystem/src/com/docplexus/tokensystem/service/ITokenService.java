package com.docplexus.tokensystem.service;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author sagar.amrutkar
 *
 */
public interface ITokenService {
	
	AtomicInteger tokeNumber = new AtomicInteger(1);
	
	public int genrateTokenNumber();

	public String genrateToken();

	public void ResetToken();

}
