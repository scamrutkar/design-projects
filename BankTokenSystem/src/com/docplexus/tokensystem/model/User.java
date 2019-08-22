package com.docplexus.tokensystem.model;

import java.util.Objects;

public class User {

	private long mobileNo;
	private String emailId;
	private String firstName;
	private String lastName;
	private boolean isPrivileged;

	public User() {
	}

	public User(long mobileNo, String emailId, String firstName, String lastName, boolean isPrivileged) {
		super();
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.isPrivileged = isPrivileged;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isPrivileged() {
		return isPrivileged;
	}

	public void setPrivileged(boolean isPrivileged) {
		this.isPrivileged = isPrivileged;
	}

	@Override
	public int hashCode() {
		return Objects.hash(emailId, mobileNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof User)) {
			return false;
		}
		User other = (User) obj;
		return Objects.equals(emailId, other.emailId) && mobileNo == other.mobileNo;
	}
	
	@Override
	public String toString() {
		return "Account [mobileNo=" + mobileNo + ", emailId=" + emailId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", isPrivileged=" + isPrivileged + "]";
	}

}
