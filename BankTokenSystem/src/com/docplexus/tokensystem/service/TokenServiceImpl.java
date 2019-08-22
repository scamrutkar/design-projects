package com.docplexus.tokensystem.service;

import java.util.concurrent.atomic.AtomicInteger;

public class TokenServiceImpl implements ITokenService {

	AtomicInteger tokeNumber = new AtomicInteger(1);

	@Override
	public int genrateTokenNumber() {
		return tokeNumber.getAndIncrement();
	}

	@Override
	public String genrateToken() {
		
		return null;
	}

	@Override
	public void ResetToken() {
		tokeNumber.set(1);
	}

}
