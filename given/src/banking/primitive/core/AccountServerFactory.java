/*
  File:	AccountServerFactory.java
  Author: Dr. Gary
  Date:	3/19/14
  
  Description: Controls for a server containing accounts
*/


package banking.primitive.core;


public class AccountServerFactory {

	protected static AccountServerFactory singleton = null;

	protected AccountServerFactory() {

	}

	public static AccountServerFactory getMe() {
		if (singleton == null) {
			singleton = new AccountServerFactory();
		}

		return singleton;
	}

	public AccountServer lookup() {
		return new ServerSolution();
	}
}
