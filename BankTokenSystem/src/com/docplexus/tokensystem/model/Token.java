package com.docplexus.tokensystem.model;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author sagar.amrutkar
 *
 */
public class Token {

	AtomicInteger tokenAtomicNumber = new AtomicInteger(1);
	private int tokenNumber;
	private Counter counter;
	private String token;

	public Token() {

	}

	public int getTokenNumber() {
		return this.getTokenNumber();
	}

	public void setTokenNumber(int tokenNumber) {
		this.tokenNumber = tokenNumber;
	}

	public Counter getCounter() {
		return counter;
	}

	public void setCounter(Counter counter) {
		this.counter = counter;
	}

	public String getToken() {
		return this.getToken();
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Token Genrated.................!!!!!!!!!!!!!!!!!").append("\n")
					.append("Token Number : ").append(token).append("\n")
					.append("Number of customers waiting in the queue are : ").append(counter.getNumberOfCustomers()).append("\n")
					.append("========================================================================================");
		return builder.toString();
	}

}
