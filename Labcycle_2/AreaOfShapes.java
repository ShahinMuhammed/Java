import java.util.Scanner;

class AreaOfShapes
{
		void display(int a)
		{
			int Area=a*a;
			System.out.println("\nThe Area of Square is : "+Area);
		}
		void display(int a,int b)
		{
			int Area=a*b;
			System.out.println("The Area of reactangle is : "+Area);
		}
		void display(int r,double p)
		{
			double Area=p*r*r;
			System.out.println("The Area of Circle is : "+Area);
		}
		public static void main(String args[])
		{
			double pi=3.14;
			AreaOfShapes as=new AreaOfShapes();
			Scanner sc= new Scanner(System.in);
			System.out.print("Enter the length of  the square : ");
			int sqrlen=sc.nextInt();
			System.out.print("Enter the length of  the rectangle : ");
			int reclen=sc.nextInt();
			System.out.print("Enter the breadth of  the rectangle : ");
			int recbre=sc.nextInt();
			System.out.print("Enter the radius of  the circle : ");
			int rad=sc.nextInt();
			as.display(sqrlen);
			as.display(reclen,recbre);
			as.display(rad,pi);
		}
}