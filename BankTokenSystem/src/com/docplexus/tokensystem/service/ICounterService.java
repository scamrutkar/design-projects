package com.docplexus.tokensystem.service;

import java.util.LinkedList;
import java.util.List;

import com.docplexus.tokensystem.model.Counter;

public interface ICounterService {
	
	List<Counter> counterList = new LinkedList<>();

	public int getCounterNumber();
	
	public void ResetCounter();
}
