package loopsLearn;

public class TriangleStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =10;
		
		for(int i =a;i>0;i--)
		{
			for(int j=a;j>i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=0;i<a;i++)
		{
			for(int j=i;j<a;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
