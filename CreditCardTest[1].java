package Homework4;
import org.junit.Test;
import static org.junit.Assert.*;


public class CreditCardTest {
String a = "1111111111111171";
	@Test
	public void WN1() {
		assertTrue(CreditCard.validateCreditCard(1111111111111171L));
	}
	@Test
	public void WN2() {
		assertFalse(CreditCard.validateCreditCard(80));
	}
	
	@Test
	public void WN3() {
		assertFalse(CreditCard.validateCreditCard(1111111111111021L));
	}
	/*
	@Test
	public void WN4() {
		assertArrayEquals(arr4, Change.changeCalc(80, 79.34));
	}
	@Test
	public void WN5() {
		assertArrayEquals(arr5, Change.changeCalc(80, 65.36));
	}*/
}
