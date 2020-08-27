//package Assignment2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Assignment2Test {

	@Test
	public void EP01() {
		assertEquals(26, Assignment2.checkCard(1111111111111121L));
	}
	
	@Test
	public void EP02() {
		assertEquals(25, Assignment2.checkCard(1111111111111021L));
	}
	
	@Test
	public void EP03() {
		assertEquals(24, Assignment2.checkCard(1111111111101021L));
	}
	
	@Test
	public void EP04() {
		assertEquals(23, Assignment2.checkCard(1111111110101021L));
	}
	
	@Test
	public void EP05() {
		assertEquals(22, Assignment2.checkCard(1111111010101021L));
	}
	
	@Test
	public void EP06() {
		assertEquals(21, Assignment2.checkCard(1111101010101021L));
	}
	
	@Test
	public void EP07() {
		assertEquals(20, Assignment2.checkCard(1110101010101021L));
	}
	
	@Test
	public void EP08() {
		assertEquals(29, Assignment2.checkCard(1111111111111124L));
	}
	
	@Test
	public void EP09() {
		assertEquals(30, Assignment2.checkCard(1111111111111125L));
	}
	
	@Test
	public void EP10() {
		assertEquals(27, Assignment2.checkCard(1111111111111122L));
	}
	
	@Test
	public void EP11() {
		assertEquals(29, Assignment2.checkCard(1111111111111171L));
	}
	
	@Test
	public void EP12() {
		assertEquals(29, Assignment2.checkCard(1111111111115071L));
	}
	
	@Test
	public void EP13() {
		assertEquals(30, Assignment2.checkCard(1111111111105081L));
	}
	
	@Test
	public void EP14() {
		assertEquals(30, Assignment2.checkCard(1111111110505081L));
	}
	
	@Test
	public void EP15() {
		assertEquals(30, Assignment2.checkCard(1111111010505091L));
	}
	
	@Test
	public void EP16() {
		assertEquals(30, Assignment2.checkCard(1111501010505091L));
	}
	
	@Test
	public void EP17() {
		assertEquals(30, Assignment2.checkCard(1101501010505091L));
	}
	
	@Test
	public void EP18() {
		assertEquals(30, Assignment2.checkCard(1501501010505091L));
	}
	
	@Test
	public void EP19() {
		assertEquals(30, Assignment2.checkCard(1511601010505091L));
	}
	
	@Test
	public void EP20() {
		assertEquals(30, Assignment2.checkCard(1511601010506091L));
	}
}


