import java.util.Scanner;

class Mark
{
	public static void main(String[] args)
	{
		int mark[]=new int[10];
		int i,total=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of subjects:");
		int size=sc.nextInt();
		System.out.println("Enter the mark of each subjects");
		for(i=0;i<size;i++)
		{
			mark[i]=sc.nextInt();
		}
		for(i=0;i<size;i++)
		{
			total=total+mark[i];
		}
		float percentage=(total/(float)size);
		System.out.println("Total mark of the Student is :"+total);
		System.out.println("Total percentage is :"+percentage);
	}
}
