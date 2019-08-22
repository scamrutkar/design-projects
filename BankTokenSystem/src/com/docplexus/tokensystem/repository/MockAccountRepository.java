package com.docplexus.tokensystem.repository;

import java.util.Objects;
import java.util.stream.Collectors;

import com.docplexus.tokensystem.model.User;

public class MockAccountRepository extends AbstractAccountRepository {

	@Override
	public User getAccountByMobileNumber(long mobileNumber) {
		return accountList.stream()
				.filter(account -> Objects.equals(mobileNumber, account.getMobileNo()))
				.collect(Collectors.toList()).get(0);
	}

	@Override
	public User getAccountByEmailId(String emailId) {
		return accountList.stream()
		.filter(account -> Objects.equals(emailId, account.getEmailId()))
				.collect(Collectors.toList()).get(0);
	}
	
	public static void main(String[] args) {
		AbstractAccountRepository repo = new MockAccountRepository();
		User account = repo.getAccountByEmailId("scamrutkar@gmail.com");
		System.out.println(account.toString());
	}

}
