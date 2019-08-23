/**
 * 
 */
package com.docplexus.tokensystem.manager;

import com.docplexus.tokensystem.model.Token;

/**
 * @author sagar.amrutkar
 *
 */
public interface ITokenSystemManager {
	
	Token genrateToken(long mobileNo);
	
	Token genrateToken( String emailId);
	
	Token genrateToken(long mobileNo, String emailId);

}
