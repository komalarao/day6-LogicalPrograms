package com.bridgelabz.logical_programs;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println("welcome to java logical programs");
		int n = 10, First_Term = 0, Second_Term = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");
    
        for (int i = 1; i <= n; ++i) {
          System.out.print(First_Term + ", ");
    
          // compute the next term
          int Next_Term = First_Term + Second_Term;
          First_Term = Second_Term;
          Second_Term = Next_Term;
        }
	        
	}

}
