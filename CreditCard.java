package Homework4;

import java.util.Scanner;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;
import org.junit.runner.*;
import java.lang.Math;
public class Change
{

	public static void main(String[] args)
  {
   Scanner scan = new Scanner(System.in);
   

  }
  public static boolean validateCreditCard(long cardNumber)
  {
   final int CARD_LENGHT = 16;
  int length, sum1=0, sum2=0, finalSum=0;
  int[] digitArray = new int[CARD_LENGHT];
  // get the card length
  length = (int) (Math.log10(cardNumber) + 1);
   if (length != CARD_LENGHT)
   {
  System.out.println("Invalid card number, need to have 16 digits");
  return false;
  }
  // get each digit from the card number and set the digitArray
  int i = CARD_LENGHT - 1;
  while(cardNumber > 0)
  {
  digitArray[i] = (int)(cardNumber%10);
  cardNumber = cardNumber/10;
  i = i - 1;
  }
  // starting from the right most digit add every other digit to sum 1
  for(i= CARD_LENGHT - 1; i > 0 ; i= i -2)
  {
  sum1 = sum1 + digitArray[i];
  }
  // get each digit not counted in above, multiply by 2 and add each digit
  //of multiplied numbers to sum 2
  for(i= CARD_LENGHT - 2; i >= 0; i= i -2)
  {
  int num = digitArray[i]*2;
  sum2 = num %10 + num/10;
  }
  // find the final sum
  finalSum = sum1 + sum2;
  // check if the last digit of the final sum is 0
  if(finalSum%10 == 0)
  {
  return true;
  }else
  {
  return false;
   } }

 
  //JUnitCore jUnitCore = new JUnitCore();
  //Result result = jUnitCore.run(ChangeTest.class);
}
