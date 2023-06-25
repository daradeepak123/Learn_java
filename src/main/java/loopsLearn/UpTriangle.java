package loopsLearn;

public class UpTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=10;i>0;i--)
		{
			for(int j=10;j>i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=0;i<10;i++)
		{
			for(int j=i;j<10;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		

	}

}
