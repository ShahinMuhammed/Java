import java.util.Scanner;
import java.util.Arrays;

class Stringsorting
{
	public static void main(String args[])
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of strings you want :");
		int size=sc.nextInt();
		String array[]=new String[size];
		System.out.println("Enter the strings \n");
		for(i=0;i<size;i++)
		{
				array[i]=sc.next();
		}
		System.out.println("\nBefore sorting");
		for(i=0;i<size;i++)
		{
				System.out.println(array[i]);
		}
		Arrays.sort(array);
		System.out.println("\nAfter sorting ");
		for(i=0;i<size;i++)
		{
				System.out.println(array[i]);
		}
	}
}