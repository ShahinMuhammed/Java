import java.util.Scanner;

class Employee{
    int empid,salary;
    String name,address;
    Employee(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter empid :");
        empid=sc.nextInt();
        System.out.print("Enter name :");
        name=sc.next();
        System.out.print("Enter salary :");
        salary=sc.nextInt();
        System.out.print("Enter address :");
        address=sc.next();
    }
}
class Teacher extends Employee{
    String department;
    String[] Subjects;
    Teacher(){
        super();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter department :");
        department=sc.next();
        System.out.print("Enter number of subjects Taught :");
        int size=sc.nextInt();
        Subjects=new String[size];
        System.out.println("Enter the subjects\n");
        for(int i=0;i<size;i++){
            Subjects[i]=sc.next();
        }
    }
    void display(){
        System.out.println("\nEmployee id :"+empid+"\nname :"+name+"\nSalary :"+salary+"\nAddress :"+address+"\nDepartment :"+department);
        System.out.print("Subjects are\n");
        for(int i=0;i<Subjects.length;i++){
            System.out.println(Subjects[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of teachers details to be entered :");
        int size=sc.nextInt();
        Teacher[] obj=new Teacher[size];
        for(int i=0;i<size;i++){
            obj[i]=new Teacher();
            System.out.println();
        }
        for(int i=0;i<size;i++){
            obj[i].display();
            System.out.println();
        }
    }
}