/**
 * 
 */
package com.docplexus.tokensystem.service;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import com.docplexus.tokensystem.model.Counter;

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
		while (count < TOTAL_COUNTER) {
			counterList.add(new Counter(count+1));
		}
	}

	@Override
	public int getCounterNumber() {
		Optional<Counter> counter = counterList.stream()
			.collect(Collectors.minBy(Comparator.comparing(Counter::getNumberOfCustomers)));
		int counterNumber = 0;
		if(counter.isPresent())
			counterNumber = counter.get().getCounterNumber();
		return counterNumber;
	}

	@Override
	public void ResetCounter() {
		counterList.stream().forEach(Counter::resetCounter);
	}

}
