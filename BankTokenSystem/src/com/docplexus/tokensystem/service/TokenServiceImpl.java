package com.docplexus.tokensystem.service;

import java.util.Objects;
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
		if (!Objects.isNull(counter)) {
			System.out.println("Genrating token ......................................................");
			int tokenNumber = genrateTokenNumber();
			Token token = new Token();
			token.setTokenNumber(tokenNumber);
			token.setToken("TokenNumber:"+tokenNumber + "," + "CounterNumber:"+counter.getCounterNumber());
			if (user.isPrivileged()) { 
				System.out.println(user.getFirstName()+" "+user.getLastName()+" is privileged user, moving ahead in the queue");
				counter.addQueue(token, 0);
			}
			else
				counter.addQueue(token);
			counter.addNumberOfCustomers();
			token.setCounter(counter);
			return token;
		} else {
			System.out.println("Something is wrong with the system. Please try after some time....!!!");
			return null;
		}
	}

	@Override
	public void ResetToken() {
		tokeNumber.set(1);
	}

}
