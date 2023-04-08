package stringLearn;

public class PrintWordsFromNumbers {
	
	
	static String convertNumberToWords(int num)
	{
		String ones[]= {"","one","two","three","four","five","six","seven","eight","nine","ten", "eleven", "twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
		String tens[]= {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
		
		if(num<20)
		{
			return ones[num];
		}
		if(num<100 )
		{
			return tens[num / 10] + ((num % 10 != 0) ? " " : "") + ones[num % 10];
		}
		if(num<1000 )
		{
			return tens[num / 100] +" hundred " + ((num % 100 != 0) ? " " : "") + ones[num % 100];
		}
		
		if(num<10000 )
		{
			 return convertNumberToWords(num / 1000) + " thousand" + ((num % 1000 != 0) ? " " : "") + convertNumberToWords(num % 1000);
		      
		}
		
		
		
		return "given number is too long";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		int num=44403;
		
		System.out.println(convertNumberToWords(num));

	}

}
