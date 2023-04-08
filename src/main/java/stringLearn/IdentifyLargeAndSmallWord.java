package stringLearn;

import java.util.Scanner;

public class IdentifyLargeAndSmallWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * String text= "this is a java program";
		 * 
		 * String words[] = text.split(" ");
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Plese enter the size of Array");
		
	//	String wor[] = {"test","worlds","welcome"};
		String words[] = new String[sc.nextInt()];
		
		for(int i = 0;i <words.length; i++) {
			
			System.out.println(" Please enter your text");
			words[i] = sc.next();
		}
		int large ;
		int small;
		small = Integer.MAX_VALUE;
		large = Integer.MIN_VALUE;
		String smallword="";
		String largeWord="";
		for(int i =0; i<words.length; i++) {
			if(words[i].length()<=small) { // small = 5 < 6.9 4 < 5
				smallword = words[i];// 5
				small = words[i].length();
			}
			if(words[i].length()>large) {// l = 0 
				largeWord = words[i];
				large = words[i].length();
			}
		}
		
		System.out.println("Largest word is " +largeWord + " and its length is "+ large);
		System.out.println("Smallest word is " +smallword + " and its length is "+ small);
	}

}
