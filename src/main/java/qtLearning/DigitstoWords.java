package qtLearning;

import java.util.Scanner;

public class DigitstoWords {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        System.out.println(convertNumberToWords(number));
	        scanner.close();
	    }
	 private static String convertNumberToWords(int number) {
	        String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
	                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

	        if (number < 20) {
	            return ones[number];
	        }

	        if (number < 100) {
	            return tens[number / 10] + ((number % 10 != 0) ? " " : "") + ones[number % 10];
	        }

	        if (number < 1000) {
	            return ones[number / 100] + " hundred" + ((number % 100 != 0) ? " and " : "") + convertNumberToWords(number % 100);
	        }

	        if (number < 1000000) {
	            return convertNumberToWords(number / 1000) + " thousand" + ((number % 1000 != 0) ? " " : "") + convertNumberToWords(number % 1000);
	        }

	        return "Number is too big to be converted to words.";
	    }

}
