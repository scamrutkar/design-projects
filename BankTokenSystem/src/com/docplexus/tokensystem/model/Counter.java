package com.docplexus.tokensystem.model;

import java.util.LinkedList;
import java.util.Objects;

public class Counter {

	int numberOfCustomers;
	LinkedList<Token> queue;
	int counterNumber;

	public Counter(int counterNumber) {
		this.counterNumber = counterNumber;
		numberOfCustomers = 0;
		queue = new LinkedList<>();
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
	public void addNumberOfCustomers() {
		this.numberOfCustomers++;
	}

	/**
	 * @return the queue
	 */
	public LinkedList<Token> getQueue() {
		return queue;
	}

	/**
	 * @param queue the queue to set
	 */
	public void addQueue(Token token) {
		addQueue(token, 0);
		if (!Objects.isNull(token))
			this.queue.add(token);

	}

	public void addQueue(Token token, int index) {
		if (!Objects.isNull(token) && index == 0)
			this.queue.add(token);
		if (!Objects.isNull(token) && index != 0)
			this.queue.add(index, token);

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
		this.numberOfCustomers = 1;
		this.queue.clear();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Counter Information\n").append("Counter Number : ")
				.append(counterNumber).append("\n").append("Number of customers waiting in the Queue : ")
				.append(numberOfCustomers).append("\n")
				.append("=============================================================================================");

		return builder.toString();
	}

}
