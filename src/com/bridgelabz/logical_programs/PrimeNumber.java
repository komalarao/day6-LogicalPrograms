package com.bridgelabz.logical_programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("welcome to java logical programs");
		int i, number, count = 0;
	      Scanner  sc = new Scanner(System.in);
	      System.out.print(" Please Enter any Integer : ");
	        number = sc.nextInt();
	        for (i = 2; i <number; i++)
	        {
	            if(number % i == 0)
	            {
	                count++;
	                break;
	            }
	        }
	        if(count == 0 && number != 1 )
	        {
	            System.out.println( number + " is a Prime Number");
	        }
	        else
	        {
	            System.out.println(number + " is is Not Prime Number");
	      sc.close();
	        }
	}

}
