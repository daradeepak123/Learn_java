package OOPS_learn;

public class Constructor_example {
	
	
	
	int empid;
	String emp_name;
	int salary;
	String Desig;
	int age;
	
	
	Constructor_example(int eid,String ename, int sal, String disg, int ag)
	{
		
		empid=eid;
		emp_name=ename;
		salary=sal;
		Desig=disg;
		age=ag;
		
	}
	
	void display()
	{
		System.out.println(empid);
		System.out.println(emp_name);
		System.out.println(salary);
		System.out.println(Desig);
		System.out.println(age);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor_example ob=new Constructor_example(100,"Ram", 200000, "Engineer", 25);
		ob.display();
		
		Constructor_example ob1=new Constructor_example(101,"Krishna", 250000, "Engineer", 25);
		ob1.display();		
		
		

	}

}
