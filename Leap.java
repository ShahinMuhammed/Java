import java.util.Scanner;
class Leap
{
	public static void main(String args[])
	{
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter the starting year: ");
		int start=inp.nextInt();
		System.out.print("Enter the ending year: ");
		int end=inp.nextInt();
		int i;
		for(i=start;i<=end;i++)
		{
			if(i%4==0&&i%100!=0||i%400==0)
			{
				System.out.println(i);
			}
		}
	}
}