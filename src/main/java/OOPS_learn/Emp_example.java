package OOPS_learn;

public class Emp_example {
	
	
	int empid;
	String emp_name;
	int salary;
	String Desig;
	int age;
	
	
	Emp_example()
	{
	
	}
	
	
	
		void show()
		{
			System.out.println();
			System.out.println(empid+1);

			System.out.println(emp_name+1);

			System.out.println(salary+1);

			System.out.println(Desig+1);

			System.out.println(age);
			
			
		}
		
		
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Emp_example e1=new Emp_example();
		
		e1.empid=101;
		e1.emp_name="Ram";
		e1.salary=200000;
		e1.Desig="Test Engineer";
		e1.age=25;
		e1.display();
		
		Emp_example e2=new Emp_example();
		
		e2.empid=100;
		e2.emp_name="Krishna";
		e2.salary=250000;
		e2.Desig="Test Engineer";
		e2.age=25;
		e2.display();
		
		
		

	}
	
	
	
	void display()
	{
		System.out.println(empid);

		System.out.println(emp_name);

		System.out.println(salary);

		System.out.println(Desig);

		System.out.println(age);
		
		
		
	}
	
	
	
	
	
	

}
