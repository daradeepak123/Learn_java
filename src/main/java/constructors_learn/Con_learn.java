package constructors_learn;

public class Con_learn {
	
	
	int age;
	int slary;
	String Name;
	
	Con_learn()
	{
		System.out.println("hello simple data print");
	}
	
	Con_learn(int age_para,int Sal_para, String Name_para)
	{
		this.age=age_para;
		this.slary=Sal_para;
		this.Name=Name_para;
		
		System.out.println(age);
		System.out.println(slary);
		System.out.println(Name);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Con_learn obj=new Con_learn(20, 200000,"Deepak");
		
		Con_learn obj1=new Con_learn();
		
		
		

	}

}
