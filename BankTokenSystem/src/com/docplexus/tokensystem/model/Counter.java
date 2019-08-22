package com.docplexus.tokensystem.model;

import java.util.Objects;
import java.util.PriorityQueue;

public class Counter {

	int numberOfCustomers;
	PriorityQueue<Token> queue;
	int counterNumber;

	public Counter(int counterNumber) {
		this.counterNumber = counterNumber;
		numberOfCustomers = 0;
		queue = new PriorityQueue<>();
	}

	/**
	 * @return the numberOfCustomers
	 */
	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}

	/**
	 * @param numberOfCustomers the numberOfCustomers to set
	 */
	public void addNumberOfCustomers(int numberOfCustomers) {
		this.numberOfCustomers++;
	}

	/**
	 * @return the queue
	 */
	public PriorityQueue<Token> getQueue() {
		return queue;
	}

	/**
	 * @param queue the queue to set
	 */
	public void addQueue(Token token) {
		if (!Objects.isNull(token))
			this.queue.add(token);
	}

	/**
	 * @return the counterNumber
	 */
	public int getCounterNumber() {
		return counterNumber;
	}

	/**
	 * @param counterNumber the counterNumber to set
	 */
	public void setCounterNumber(int counterNumber) {
		this.counterNumber = counterNumber;
	}
	
	public void resetCounter() {
		
	}

}
