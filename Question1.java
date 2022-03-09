package TestPart;

import java.util.ArrayList;
import java.util.Scanner;


public class Question1 {

//	Q.1. Create a university enrolment system in which selection criteria of the 
//	candidate is as follows :
//	1)total aggregate >=80% (10+2)
//	2)then display the possible options for courses for enrolment using 
//	collections arraylist(5 course options)
//	3)ask for the choice from your
//	4)as per the choice take marks in specific stream subjects and calculate
//	the average
//	5)if the average is greater than 90% then candidate is eligible for application.

	public static void main(String[] args) {

//		Q.1. Create a university enrolment system in which selection criteria of the 
//		candidate is as follows :
//		1)total aggregate >=80% (10+2)
		Scanner sc = new Scanner(System.in);
		
		String stuName;
		double tenthM,twelvethM,avg;
		char ch ='Y';
		
		while(ch=='y' || ch=='Y')
		{
			
			System.out.println("Enter the name : ");
			stuName=sc.next();
			System.out.println("Enter the percentage of 10th standard : ");
			tenthM=sc.nextDouble();
			System.out.println("Enter the percentage of 12th standard : ");
			twelvethM=sc.nextDouble();
			avg=(tenthM+twelvethM)/2;
			System.out.println(stuName+ " overall average is : "+avg);
		
			if(avg>=80)
			{
				System.out.println("Fine you are Eligible fo this course");
				
			}
			else
			{
				System.out.println("you are not Eligible");
			}
		
//			2)then display the possible options for courses for enrolment using 
//			collections arraylist(5 course options)
		
			
			ArrayList<String> al = new ArrayList<>();
			al.add("1.Engineering cs");
			al.add("2.Medical");
			al.add("3.EEE");
			al.add("4.Agriculture");
			al.add("5.Arts");
			
			
			System.out.println("Enter your choice: ");
			System.out.println("Enter 1 for Engineering and 2 for Medical and o on..: ");
			
			int option = sc.nextInt();
			
			
			switch(option)
			{
			case 1:
				System.out.println("Enter the botnoy and zoology subjects ");
				double bot = sc.nextDouble();
				double zoo = sc.nextDouble();
				double avg1 = bot+zoo/2;
				System.out.println("Your average is = "+avg1);
				if(avg1>=85)
				{
					System.out.println("Congrats!..You are eligible for the Course Medical ");
				}
				break;
			
			case 2:
				System.out.println("Enter the Maths and CS subjects ");
				double math = sc.nextDouble();
				double cs = sc.nextDouble();
				double avg2 = math+cs/2;
				System.out.println("Your average is = "+avg2);
				
				if(avg2>=85)
				{
					System.out.println("Congrats!..You are eligible for the Course Engineering ");
				}
				break;
			case 3:
				
				System.out.println("Enter the PCM subjects ");
				double phys = sc.nextDouble();
				double chemi = sc.nextDouble();
				double mat = sc.nextDouble();
				double avg3 = phys+chemi+mat/3;
				System.out.println("Your average is = "+avg3);
				
				if(avg3>=90)
				{
					System.out.println("Congrats!..You are eligible for the Course Engineering ");
				}
				break;
				
			case 4:
				
				System.out.println("Enter the PCM subjects ");
				double p = sc.nextDouble();
				double c = sc.nextDouble();
				double m = sc.nextDouble();
				double avg4 = p+c+m/3;
				System.out.println("Your average is = "+avg4);
				
				if(avg4>=90)
				{
					System.out.println("Congrats!..You are eligible for the Course Engineering ");
				}
				break;
			case 5:
				System.out.println("Enter the PCM subjects :");
				double ph = sc.nextDouble();
				double che = sc.nextDouble();
				double ma  = sc.nextDouble();
				double avg5 = ph+che+ma/3;
				System.out.println("Your average is = "+avg5);
				
				if(avg5>=90)
				{
					System.out.println("Congrats!..You are eligible for the Course EEE ");
				}
				break;
				
				default:
					System.out.println("Enter the correct choice :");
			}
					
					
					System.out.println("Do you want to check one more time");
					System.out.println("Click Y for Yes and N for No");
					ch=sc.next().charAt(0);
					
		}
		
	}

}


	
	
