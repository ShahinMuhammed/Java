import java.util.Arrays;
import java.util.Scanner;

class Stringcharactersorting
{
	public static void main(String args[])
	{
		int temp,i,j;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the string :");
		String input=sc.nextLine();
		System.out.print("The String before sorting :"+input);
		char array[]=input.toCharArray();
		Arrays.sort(array);
		/*for(i=0;i<array.length;i++)
		{
			for(j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=(char)temp;
				}
			}
		}*/
		String newArray= new String(array);
		System.out.println("\nThe String after sorting :"+newArray);
	}
}