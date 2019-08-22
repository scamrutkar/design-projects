package com.docplexus.tokensystem.service;

import java.util.LinkedList;
import java.util.List;

import com.docplexus.tokensystem.model.Counter;
import com.docplexus.tokensystem.model.User;

public interface ICounterService {
	
	List<Counter> counterList = new LinkedList<>();

	public Counter getCounter(User user);
	
	public void ResetCounter();
}
