import java.util.Scanner;

class Rectangle{
    void area(double len,double bre){
        double recArea=len*bre;
        System.out.println("This is area of rectangle is :"+recArea);
        System.out.println();
    }
}

class Square extends Rectangle{
    void area(double a){
        double sqrArea=a*a;
        System.out.println("This is area of Square is :"+sqrArea);
        System.out.println();
    }
}

class Circle extends Square{
    void area(double r){
        double cirArea=3.14*r*r;
        System.out.println("This is area of Circle is :"+cirArea);
        System.out.println();
    }
}
class MethodOverRiding{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the circle:");
        double radius=sc.nextDouble();
        Circle obj=new Circle();
        obj.area(radius);

        System.out.print("Enter the length of the rectangle:");
        double length=sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle:");
        double breadth=sc.nextDouble();
        Rectangle obj1=new Rectangle();
        obj1.area(length,breadth);

        System.out.print("Enter the side of square :");
        double side=sc.nextDouble();
        Square obj2=new Square();
        obj2.area(side);
    }
}
