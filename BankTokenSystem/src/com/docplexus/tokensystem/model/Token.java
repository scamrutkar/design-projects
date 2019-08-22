package com.docplexus.tokensystem.model;

import java.util.concurrent.atomic.AtomicInteger;

import com.docplexus.tokensystem.service.CounterServiceImpl;
import com.docplexus.tokensystem.service.ICounterService;
import com.docplexus.tokensystem.service.ITokenService;
import com.docplexus.tokensystem.service.TokenServiceImpl;

/**
 * @author sagar.amrutkar
 *
 */
public class Token {

	AtomicInteger tokenAtomicNumber = new AtomicInteger(1);
	private int tokenNumber;
	private int counterNumber;
	private String token;
	
	ITokenService tokenService;
	ICounterService counterService;

	public Token() {
		tokenService = new TokenServiceImpl();
		counterService = new CounterServiceImpl();
	}

	public int getTokenNumber() {
		return tokenAtomicNumber.getAndIncrement();
	}

	public void setTokenNumber(int tokenNumber) {
		this.tokenNumber = tokenNumber;
	}

	public int getCounterNumber() {
		return counterService.getCounterNumber();
	}

	public void setCounterNumber(int counterNumber) {
		this.counterNumber = counterNumber;
	}

	public String getToken() {
		return this.getTokenNumber() +" "+this.getCounterNumber();
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "Token [tokenNumber=" + tokenNumber + ", counterNumber=" + counterNumber + ", token=" + token + "]";
	}

}
