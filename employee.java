import java.io.*;

import java.util.*;

class employee
{
		//instance variables 
	String fname,lname;
	String status;
	int empid;
	String sdate,edate;
	String DOB;
	String des;
	String dep;
	String rman,gender;
	String bgp;
	String add;
	Scanner sc=new Scanner(System.in);   //creat an obj for scanner class  


//instance methods 

	void read()
	{
		System.out.println("Enter the First Name: ");
		fname=sc.next();
		System.out.println("Enter the Last Name: ");
		lname=sc.next();
		System.out.println("Enter Employee Id: ");
		empid=sc.nextInt();
		System.out.println("Enter Start date: ");
        sdate=sc.next();
		System.out.println("Enter Designation: ");
		des=sc.next();
		System.out.println("Enter Department: ");
		dep= sc.next();
		System.out.println("Enter End date: ");
        edate=sc.next();
		System.out.println("Enter Status: ");
        status=sc.next();
		System.out.println("Enter date of birth");
        DOB=sc.next();
		System.out.println("Enter Reporting manager: ");
        rman=sc.next();
		System.out.println("Enter gender: ");
        gender=sc.next();
		System.out.println("Enter blood group: ");
        bgp=sc.next();
		System.out.println("Enter the address: ");
        add=sc.next();
        System.out.println("\n");
	}

	void dep()
	{
		Scanner scan=new Scanner(System.in);
        System.out.println("Depenadants");
		System.out.println("Enter the First Name: ");
		String fn=scan.next();
		System.out.println("Enter the Last Name: ");
		String ln=scan.next();
		System.out.println("Enter gender: ");
        String gen=scan.next();
		System.out.println("Enter date of birth");
        String dob=scan.next();
		System.out.println("Enter Relationship");
        String rel=scan.next();
        System.out.println("\tFirst Name\tLast Name\tGender\tDateofBirth\tRelationship");
        System.out.println("\t"+fn+"\t\t"+ln+"\t\t"+gen+"\t\t"+dob+"\t\t"+rel);
	}

	void edu()
	{
		Scanner s=new Scanner(System.in);
        System.out.println("Educational Qualification");

		System.out.println("Enter the type");
        String type=s.next();
		System.out.println("Enter Start date: ");
        String stdate=s.next();
		System.out.println("Enter End date: ");
        String eddate=s.next();
		System.out.println("Enter the institution: ");
        String inst=s.next();
		System.out.println("Enter the address: ");
        String address=s.next();
		System.out.println("Enter the percentage: ");
        double per=s.nextDouble();
        System.out.println("\tType\tStart Date\tEnd date\tInstitition\tAddress\tPercentage");
        System.out.println("\t"+type+stdate+"\t\t"+eddate+"\t\t"+inst+"\t\t"+address+"\t\t"+per);
	}
	void display()
	{
		System.out.println("\t"+fname+"\t\t"+lname+"\t\t"+empid+"\t\t"+sdate+"\t\t"+des+"\t\t"+dep+"\t\t"+edate+"\t\t"+status+"\t\t"+DOB+"\t\t"+rman+"\t\t"+gender+"\t\t"+bgp+"\t\t"+add);
	}
    	public static void main(String[] args) throws IOException{
		
		// TODO Auto-generated method stub
		int n;
		Scanner ss=new Scanner(System.in);
		System.out.print("Enter the number of employees to be read: ");
		n=ss.nextInt();
        System.out.println("\n");
		employee s[]=new employee[n];  // Array declaration for student 


		for(int i=0;i<n;i++)
		{
			System.out.println("please enter employee "+(i+1)+" record");
			s[i]=new employee();// create an n student object 
			s[i].read();
            


		}
		System.out.println("EMPLOYEE DETAILS");
		System.out.println("S.NO\tFirst Name\tLast Name\tEmployee Id\tStart Date\tStatus\tDateofBirth\tReporting Manager\tGender\tBlood Group\tAddress");
		for(int i=0;i<n;i++)
		{
			System.out.print((i+1));
			s[i].display();
            s[i].dep();
            s[i].edu();
           
			
		}

	}

}







