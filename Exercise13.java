/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution, Exercise 13
 *  Copyright 2021 Mayank Goyal
 */

import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.*;

class Main {
  public static void main(String[] args) {

  Locale locale = new Locale("en", "US");
  NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

  DecimalFormat format = new DecimalFormat("0.#");

  Scanner scanner = new Scanner(System.in);

  System.out.println("What is the principal amount? ");
  int principal = scanner.nextInt();

  System.out.println("What is the rate? ");
  double interestRate = scanner.nextFloat();

  System.out.println("What is the number of years? ");
  int years = scanner.nextInt();

  System.out.println("What is the number of times the interest is compounded per year? ");
  double timesCompounded = scanner.nextFloat();

  double endAmount = (principal * Math.pow((1 + (interestRate/100)/timesCompounded), (timesCompounded * years)));
  
  System.out.println("$" + format.format(principal) + " invested at " + String.format("%.1f", interestRate) + "% for " + years + " years compounded " + format.format(timesCompounded) + " times per year is $" + String.format("%.2f", endAmount) + ".");

  }
}