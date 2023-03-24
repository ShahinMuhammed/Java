public class Rectangle {
    int bre;
    double len;

    void setData(double Length,int Breadth)
    {
        len = Length;
        bre = Breadth;
    }

    double getArea()
    {
        return len*bre;
    }

    public static void main(String []args)
    {
        Rectangle ob = new Rectangle();
        ob.setData(12.48, 13);

        System.out.println("Area of the Rectangle with length = "+ob.len+" breadth = "+ob.bre+" is : "+ob.getArea());
    }
}

