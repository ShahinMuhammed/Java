class Rectangle{
    void area(){
        //int recArea=len*bre;
        System.out.print("This is area of rectangle");
    }
}

class Square extends Rectangle{
    void area(){
        //int sqrArea=a*a;
        System.out.print("This is area of Square");
    }
}

class Circle extends Square{
    void area(){
        //double cirArea=pi*r*r;
        System.out.print("This is area of Circle");
    }
}
class MethodRiding{
    public static void main(String[] args) {
        Circle obj=new Circle();
        obj.area();
    }
}