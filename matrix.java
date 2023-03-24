import java.util.Scanner;

class Matrix
{
	public static void main(String[] args)
	{
		int a[][]=new int[10][10];
		int b[][]=new int[10][10];
		int c[][]=new int[20][20];
		int i,j;
		Scanner matrix=new Scanner(System.in);
		System.out.print("Enter the size of matrices");
		int size=matrix.nextInt();
		
		
		System.out.println("Enter the first matirx");
		for(i=1;i<=size;i++)
			for(j=1;j<=size;j++)
				a[i][j]=matrix.nextInt();
		System.out.println("Enter the second matirx");
		for(i=1;i<=size;i++)
			for(j=1;j<=size;j++)
				b[i][j]=matrix.nextInt();
		
		for(i=1;i<=size;i++)
			for(j=1;j<=size;j++)
				c[i][j]=a[i][j]+b[i][j];
	
		System.out.println("Addition of both the matrix");
		for(i=1;i<=size;i++)
		{
			for(j=1;j<=size;j++)
			{
				System.out.print(c[i][j] +" ");
			}
			System.out.println();
		}
	} 
}
