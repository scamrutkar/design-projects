package com.docplexus.tokensystem.service;

import java.util.concurrent.atomic.AtomicInteger;

import com.docplexus.tokensystem.model.Counter;
import com.docplexus.tokensystem.model.Token;
import com.docplexus.tokensystem.model.User;

public class TokenServiceImpl implements ITokenService {

	ICounterService counterService;

	AtomicInteger tokeNumber = new AtomicInteger(1);

	public TokenServiceImpl() {
		counterService = new CounterServiceImpl();
	}

	public int genrateTokenNumber() {
		return tokeNumber.getAndIncrement();
	}

	@Override
	public Token genrateToken(User user) {
		
		Counter counter = counterService.getCounter(user);
		int tokenNumber = genrateTokenNumber();
		Token token = new Token();
		token.setCounterNumber(counter.getCounterNumber());
		token.setToken(tokenNumber+" "+counter.getCounterNumber());
		token.setTokenNumber(tokenNumber);
		
		if(user.isPrivileged())
			counter.addQueue(token,0);
		else
			counter.addQueue(token);
		
		return token;
	}

	@Override
	public void ResetToken() {
		tokeNumber.set(1);
	}

}
