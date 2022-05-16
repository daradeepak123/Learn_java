package OOPS_learn;

public class Return_learn {
	
	int a;
	int b;

	int sum(int z,int x)
	{
		return (z+x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Return_learn ob = new Return_learn();
		System.out.println(ob.sum(20, 30));
		
		int w=ob.sum(50, 60);
		System.out.println(w);

	}

}
