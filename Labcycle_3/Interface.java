import java.util.Scanner;

interface operations{
    void area(int a,double b);
    void perimeter(int a,double b);
}

class Rectangle implements operations{
    public void area(int a,double b){
        double areaOfR= a*b;
        System.out.println("Area of rectangle :"+areaOfR);
    }
    public void perimeter(int a,double b){
        double perimeterOfR = 2*(a+b);
        System.out.println("Perimeter of rectangle :"+perimeterOfR);
    }
}

class Circle implements operations{
    public void area(int r,double pi){
        double areaOfC = pi*r*r;
        System.out.println("Area of cirle :"+areaOfC);
    }
    public void perimeter(int r,double pi){
        double perimeterOfC = 2*pi*r;
        System.out.println("Perimeter of circle :"+perimeterOfC);

    }
}

class Interface{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of rectangle:");
        int length=sc.nextInt();
        System.out.print("Enter the breadth of rectangle:");
        double breadth=sc.nextInt();
        System.out.print("Enter the radius of circle:");
        int radius=sc.nextInt();
        double pi=3.14;
        operations obj1=new Rectangle();
        obj1.area(length,breadth);
        obj1.perimeter(length,breadth);
        operations obj2=new Circle();
        obj2.area(radius,pi);
        obj2.perimeter(radius,pi);
    }
}