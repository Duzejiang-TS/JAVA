package Lab_report;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class Practise12_4 {

	public static void main(String[] args) throws IOException {
		File file = new File("Exercise12_15.txt");
	    if (!file.exists()) {
	        try (PrintWriter output = new PrintWriter(file);)
	        {
	          for (int i = 1; i <= 100; i++)
	            output.print((int)(Math.random() * 100) + " ");
	        }
	    }
		
	    try (Scanner input = new Scanner(file);) 
	    {
	      int[] numbers = new int[100];
	      for (int i = 0; i < 100; i++)
	    	  numbers[i] = input.nextInt();
	      Arrays.sort(numbers);              
	      for (int i = 0; i < 100; i++)
	        System.out.print(numbers[i] + " ");
	    }
	}
}