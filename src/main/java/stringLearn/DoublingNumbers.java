package stringLearn;

public class DoublingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		for(int i=100;i<1000;i++)
		{
			String num=Integer.toString(i);
			boolean bool=false;
			for(int j=0;j<num.length();j++)
			{
				char digit=num.charAt(j);
				if(num.indexOf(digit)!=num.lastIndexOf(digit))
				{
					System.out.println(num + "is a repeating number");

					break;
				}
			}

			StringBuffer sb=new StringBuffer(num);
			String rev=sb.reverse().toString();
			if(num.equals(rev))
			{
				System.out.println("this num is a palindrome " +num);
			}

		}

	}

}
