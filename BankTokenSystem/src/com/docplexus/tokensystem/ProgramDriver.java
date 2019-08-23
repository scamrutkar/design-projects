package com.docplexus.tokensystem;

import com.docplexus.tokensystem.manager.ITokenSystemManager;
import com.docplexus.tokensystem.manager.TokenSystemManager;
import com.docplexus.tokensystem.model.Token;

public class ProgramDriver {

	public static void main(String[] args) {
		ITokenSystemManager manager = new TokenSystemManager();
		Token token = manager.genrateToken("scamrutkar@gmail.com");
		System.out.println(token.toString());
		
		Token token2 = manager.genrateToken("rohitpandit@gmail.com");
		System.out.println(token2.toString());
		
		Token token3 = manager.genrateToken("vijayjawale@gmail.com");
		System.out.println(token3.toString());
		
		Token token4 = manager.genrateToken("niteshbansode@gmail.com");
		System.out.println(token4.toString());
	}
}
