package stringLearn;

import java.util.Scanner;

public class MaxRepeated {

	public void max(String text) {
		int max =0;
		char maxchar = 0;
		char chars[] = text.toCharArray();
		for(int i = 0; i<chars.length;i++) {
			int count =1;
			for(int j =i+1; j<chars.length;j++) {
				if(chars[i]==chars[j] && chars[i]!='*') {
					count++;
					chars[j] = '*';
				}
			}
			if(count>max) {
				max = count;
				maxchar = chars[i];
			}
		}
		System.out.println(maxchar + " repeated : " + max);
		System.out.println(chars);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Please enter your text");
		
		MaxRepeated mr = new MaxRepeated();
		String text = sc.next();
		mr.max(text);
	}

}
