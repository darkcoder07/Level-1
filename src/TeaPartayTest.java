// Copyright Wintriss Technical Schools 2013
import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class TeaPartayTest {
	/**
	 * Jane Austen is a women, so say “Hello Ms. Austen”.
 * George Orwell is a man, so say “Hello Mr. Orwell”.
 * Isaac Newton was knighted, so say Hello Sir Newton. 
 **/

	@Test
	public void test() {
		teaPartay teaParty = new teaPartay() ;
		teaParty.welcome(null, false, false);
		assertEquals("Hello Ms. Austen",
				teaParty.welcome("Austen", true, false));
assertEquals("Hello Mr. Orwell",
				teaParty.welcome("Orwell", false, false));
		assertEquals("Hello Sir Newton",
				teaParty.welcome("Newton", false, true));
	}
}

