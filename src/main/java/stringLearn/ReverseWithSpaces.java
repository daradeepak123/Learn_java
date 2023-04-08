package stringLearn;

public class ReverseWithSpaces {

	public void re(String text) {		
		char chars[] = text.toCharArray();
		char reverse[] = new char[chars.length];
		for(int i =0; i<chars.length; i++) {
			if(chars[i]==' ') {
				reverse[i] = ' ';
			}
		}
		int j = reverse.length-1; //"this is a 
								//{'','','','',' ','','',' ',''}
		for(int i =0; i<chars.length; i++) {//{'t','h','i','s',' ','i','s',' ','a'}
			if(chars[i]!=' ') {
				if(reverse[j]==' ') {
					j--;
				}
				reverse[j]=chars[i]; //{'a','s','i','s',' ','i','h',' ','t'}
				j--;
				}
			}
		System.out.println(String.valueOf(reverse));
	}
	
	
	
	public static void main(String[] args) {
		
		String s ="This is java hello";
		System.out.println(s);
		ReverseWithSpaces rs = new ReverseWithSpaces();
		rs.re(s);
	}

}
