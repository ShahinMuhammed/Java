import java.util.Scanner;
interface Sports{
	void Activities(float s);
}
interface Student{
	void Marks(int m,int r,String n);
}
class Result implements Sports,Student{
	int marks,registerNo;
	float score;
	String Name;
	public void Activities(float s){
		score=s;
	}
	public void Marks(int m,int r,String n){
		marks=m;
		registerNo=r;
		Name=n;
	}
	public void display()
	{
		System.out.println("Name of the student:"+Name);
		System.out.println("Register number:"+registerNo);
		System.out.println("Marks scored:"+marks);
		System.out.println("Scores obtained :"+score);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the student name:");
		String name=sc.nextLine();
		System.out.print("Enter register number:");
		int registerNo=s.nextInt();
		System.out.print("Enter mark:");
		int marks=s.nextInt();
		System.out.print("Enter the sports score:");
		float score=s.nextFloat();
		Result obj=new Result();
		obj.Activities(score);
		obj.Marks(marks,registerNo,name);
		obj.display();
	}	
}
