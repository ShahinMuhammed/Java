import java.util.Scanner;
class Student
{
    public static void main(String[] args)
    {
        int i;
        int mark[]=new int[20];
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of subjects :");
        int totalSub=in.nextInt();
        for(i=0;i<totalSub;i++)
        {
            mark[i]=in.nextInt();
        }
        int totalMarks=0;
        for(i=0;i<totalSub;i++)
        {
            totalMarks+=mark[i];
        }
        System.out.println("Total marks of the subjects:"+totalMarks);
        System.out.println("Average of the marks:"+(totalMarks/totalSub));
    } 
}