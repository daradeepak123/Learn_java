package OOPS_learn;

public class Method_call_data {
	
	

	int empid;
	String emp_name;
	int salary;
	String Desig;
	int age;
	
	int setdata_new(int eid,String ename, int sal, String disg, int ag)
	{
		
		age=ag+1;
		empid=eid;
		emp_name=ename;
		
		Desig=disg;
		salary=sal;
		
		return ag;
		
		
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
		
		Method_call_data ob=new Method_call_data();
		ob.setdata_new(101, "HEllo", 2000000, "Test engineer", 25);
		ob.display();
		
		int g=ob.setdata_new(101, "HEllo", 2000000, "Test engineer", 25);
		
		Method_call_data ob1=new Method_call_data();
		ob1.setdata_new(102, "Hi", 2000000, "Test engineer", 25);
		ob1.display();
		
		

	}

}
