package com.docplexus.tokensystem.repository;

import java.util.Objects;
import java.util.stream.Collectors;

import com.docplexus.tokensystem.model.Account;

public class MockAccountRepository extends AbstractAccountRepository {

	@Override
	public Account getAccountByMobileNumber(long mobileNumber) {
		return accountList.stream()
				.filter(account -> Objects.equals(mobileNumber, account.getMobileNo()))
				.collect(Collectors.toList()).get(0);
	}

	@Override
	public Account getAccountByEmailId(String emailId) {
		return accountList.stream()
		.filter(account -> Objects.equals(emailId, account.getEmailId()))
				.collect(Collectors.toList()).get(0);
	}
	
	public static void main(String[] args) {
		AbstractAccountRepository repo = new MockAccountRepository();
		Account account = repo.getAccountByEmailId("scamrutkar@gmail.com");
		System.out.println(account.toString());
	}

}
