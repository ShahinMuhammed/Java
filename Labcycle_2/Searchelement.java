import java.util.Scanner;

class Searchelement
{
	public static void main(String args[])
	{
		int i,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array :");
		int size=sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the array elements");
		for(i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.print("Enter the Search element :");
		int search=sc.nextInt();
		for(i=0;i<size;i++)
		{
			if(array[i]==search)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println(search+" is present in array");
		}
		else
		{
			System.out.println(search+" is not present in array");
		}
	}
}