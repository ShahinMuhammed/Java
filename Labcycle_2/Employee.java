import java.util.Scanner;

class Employee
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of employees to  be entered");
		int length=sc.nextInt();
		EmployeData[] array=new EmployeData[length];
		for(int i=0;i<length;i++)
		{
			array[i]=new EmployeData();
		}
		System.out.print("Enter the Search key[Employee number]");
		int searchKey=sc.nextInt();
		searchArray(array,searchKey);
	}
	static void searchArray(EmployeData array[],int sk)
	{
		int i,flag=0;
		for(i=0;i<array.length;i++)
		{
			if(array[i].Eno==sk)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Employee Number of : "+sk+" is found and Name is "+array[i].Ename+" and salary is "+array[i].Salary);
		}
		else{
			System.out.println("Employee not found : "+sk);
		}
	}
	static class EmployeData
	{
		int Eno,Salary;
		String Ename;
		Scanner sc=new Scanner(System.in);
		
		EmployeData()
		{
			System.out.print("Enter employee number : ");
			Eno=sc.nextInt();
			System.out.print("Enter employee name : ");
			Ename=sc.next();
			System.out.print("Enter Salary : ");
			Salary=sc.nextInt();
		}
	}
}