import java.util.Scanner;
class Matrix
{
	public static void main(String [] args)
	{
		int a[][]=new int[10][10];
		int b[][]=new int[10][10];
		int c[][]=new int[20][20];
		int i,j;
		Scanner inp= new Scanner(System.in);
		System.out.print("Enter the row :");
		int row=inp.nextInt();
		System.out.print("Enter the colomn :");
		int col=inp.nextInt();
		System.out.println("Enter the first matrix");
		for(i=0;i<row;i++)
			for(j=0;j<col;j++)
				a[i][j]=inp.nextInt();
		System.out.println("Enter the second matrix");
		for(i=0;i<row;i++)
			for(j=0;j<col;j++)
				b[i][j]=inp.nextInt();
		for(i=0;i<row;i++)
			for(j=0;j<col;j++)
				c[i][j]=a[i][j]+b[i][j];
		System.out.println("The addtion of the two matrix are ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++){
				System.out.print(c[i][j]+" ");
				}
			System.out.println();
		}
	}
}