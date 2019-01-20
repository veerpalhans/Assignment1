
import java.util.Scanner;

public class Assignmnt1 {
	
	int empNo;
	String empName;
	String date;
	char dcode;
	String dept;
	int basic;
	int hra;
	int it;
	int da;
	int salary;
	Scanner input;
	public Assignmnt1()
	{
		input =new Scanner(System.in);
		
	}
	public void putData()
	{
		System.out.println("Enter Employee Number:");
		empNo=input.nextInt();
		input.nextLine();
		
		System.out.println("Enter Employee Name:");
		empName=input.next();
		
		System.out.println("Enter join date:");
		date=input.next();
		
		System.out.println("Enter Designation Code:");
		dcode=input.next().charAt(0);
		input.nextLine();
		
		System.out.println("Enter Dept:");
		dept=input.next();
		
		System.out.println("Enter  Basic:");
		basic=input.nextInt();
		
		System.out.println("HRA:");
		hra=input.nextInt();
		
		System.out.println("Enter IT:");
		it=input.nextInt();
	
	switch(dcode) {
	case 'e':
		System.out.println("Designation:Engineer");
		da=20000;
		System.out.println("DA:"+da);
		salary=basic+hra+da-it;
		System.out.println("Salary:"+salary);
		break;	
		
	case 'c':
		System.out.println("Designation:Consultant");
		da=32000;
		System.out.println("DA:"+da);
		salary=basic+hra+da-it;
		System.out.println("Salary:"+salary);
		break;	
		
	case 'k':
		System.out.println("Designation:Clerk");
		da=12000;
		System.out.println("DA:"+da);
		salary=basic+hra+da-it;
		System.out.println("Salary:"+salary);
		break;	
		
	case 'r':
		System.out.println("Designation:Receptionist");
		da=15000;
		System.out.println("DA:"+da);
		salary=basic+hra+da-it;
		System.out.println("Salary:"+salary);
		break;	
		
	case 'm':
		System.out.println("Designation:Manager");
		da=40000;
		System.out.println("DA:"+da);
		salary=basic+hra+da-it;
		System.out.println("Salary:"+salary);
		break;	
	}
}
	public static void main(String[] args)
	{
		Assignmnt1 a1=new Assignmnt1();
		a1.putData();
	}
}