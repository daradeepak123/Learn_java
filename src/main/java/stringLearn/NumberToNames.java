package stringLearn;

import java.util.Scanner;

import groovy.lang.MetaClassImpl.Index;

public class NumberToNames {

public void name(String num) {
	
	
		
		
		char chars[]= num.toCharArray();
		
		int size=chars.length;
		System.out.println(size);
		for( int i =0; i<chars.length; i++) {
			
			switch(chars[i]) {
			case '0':
				System.out.print(" Zero ");
				break;
			case '1':
			System.out.print("one ");
			break;
			case '2':
				System.out.print("two ");
			break;
			case '3':
				System.out.print("three ");
			break;
			case '4':
				System.out.print("four ");
			break;
			case '5':
			System.out.print("Five ");
			break;
			case '6':
				System.out.print("six ");
			break;
			case '7':
			System.out.print("seven ");
			break;
			case '8':
			System.out.print("eight ");
			break;
			case '9':
			System.out.print("nine ");
			break;
			}
			
			if(size<7)
			{
				if (size==6)
				{
					System.out.print("lakhs ");
				}
				if (size==4)
				{
					System.out.print("thousand ");
				}
				if(size==3)
				{
					System.out.print("hundred ");
				}
			}
			size--;
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a=200;
		
		String s= Integer.toString(a);
		
		String num = "545432";
		
		NumberToNames nm = new NumberToNames();
		nm.name(num);
		
	}	

}
