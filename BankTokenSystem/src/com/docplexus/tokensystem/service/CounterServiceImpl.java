/**
 * 
 */
package com.docplexus.tokensystem.service;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import com.docplexus.tokensystem.model.Counter;
import com.docplexus.tokensystem.model.User;

/**
 * @author sagar.amrutkar
 *
 */
public class CounterServiceImpl implements ICounterService {

	private static final int TOTAL_COUNTER = 3;

	public CounterServiceImpl() {
		createCounter();
	}

	private void createCounter() {
		int count = 0;
		System.out.println("Started creating counters...............!!!!!!!");
		while (count < TOTAL_COUNTER) {
			counterList.add(new Counter(count + 1));
			count++;
		}
		printCounters();
	}

	private void printCounters() {
		int count = 0;
		System.out.println("====================================================================================== ");
		while (count < TOTAL_COUNTER) {
			System.out.println(counterList.get(count).toString());
			count++;
		}
	}

	@Override
	public Counter getCounter(User user) {
		Optional<Counter> counter = counterList.stream()
				.collect(Collectors.minBy(Comparator.comparing(Counter::getNumberOfCustomers)));
		if (counter.isPresent())
			return counter.get();
		return null;
	}

	@Override
	public void ResetCounter() {
		counterList.stream().forEach(Counter::resetCounter);
	}

}
