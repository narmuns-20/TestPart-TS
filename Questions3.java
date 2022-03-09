package TestPart;

import java.util.Scanner;

public class Questions3 {

//	Q.3 Create a program to calculate the no. of capital letters, smaller letters ,digits and special symbols in a string.
//	E.g. : Admin@123
//
//	Capital letters : 1
//	Small letters : 4
//	symbol : 1
//	digit : 3

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the input : ");
		
		//sc.nextLine();
		String str = sc.nextLine();
		
		int uppercase =0,lowercase=0, digits=0,specialchar=0;
		
		for(int i=0; i<str.length();i++)
		{
			char ch = str.charAt(i);
			
			if(ch>='A'&& ch<='Z')
			{
			uppercase++;
			}
			else if(ch>='a' && ch<='z')
			{
				lowercase++;
			
			}
			else if(ch>='0' && ch<= '9')
			{
				digits++;
			}
			else
			{
				specialchar++;
			}

		}
		System.out.println("uppercase : "+uppercase);
		System.out.println("lowercase : "+lowercase);
		System.out.println("digits : "+digits);
		System.out.println("specialchar : "+specialchar);
		
		
		
		
	}

}
