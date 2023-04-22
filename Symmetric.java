import java.util.Scanner;

public class Symmetric
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int[][] matrix = new int[20][20];
		int i,j,flag=0;
		
		System.out.print("Enter the row of matrix:");
		int row= sc.nextInt();
		System.out.print("Enter the column of matrix:");
		int col= sc.nextInt();
		if(row!=col)
		{
			System.out.println("This is not a symmetric matrix");
			return;
		}

		System.out.println("Enter the Matrix");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println("The transpose of the matrix is ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
					System.out.print(matrix[j][i] +" ");
			}
		System.out.println();
		}
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				if(matrix[i][j] != matrix[j][i])
				{
				flag =1;
				break;
				}
			}
		}
		
		if(flag ==1 )
		{
			System.out.println("The matrix is not symmetric");
		}
		
		else
		{
			System.out.println("The matrix is symmetric");
		}
	}
}