import java.util.Date;
import java.util.Scanner;

interface Calculations{
    double calculate();
}

class Product implements Calculations{
    int quantity,i,productId;
    double unitPrice,total;
    String name;
    Scanner sc=new Scanner(System.in);
    Scanner s=new Scanner(System.in);
    Product(){
        System.out.print("Enter product ID :");
        this.productId=sc.nextInt();
        System.out.print("Enter product name :");
        this.name=s.nextLine();
        System.out.print("Enter the quantity :");
        this.quantity=sc.nextInt();
        System.out.print("Enter the price :");
        this.unitPrice=sc.nextDouble();
        this.total=calculate();
    }
    void display()
    {
        System.out.println(String.format("%d\t\t%s\t\t%d\t\t%,.2f\t\t%,.2f",this.productId,this.name,this.quantity,this.unitPrice,this.total));
    }
    public double calculate(){
        return this.unitPrice*this.quantity;
    }
}

class BillingSystem{
    static double netAmount;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the  orderNo :");
        int orderNo=sc.nextInt();
        Date date=new Date();
        System.out.print("Enter the number of products you want:");
        int pCount=sc.nextInt();
        Product[] product=new Product[pCount];
        for(int i=0;i<pCount;i++){
            product[i]=new Product();
        }
        System.out.print("\n\n");
        System.out.println("Order No:"+orderNo);
        System.out.println("Date :"+date);
        System.out.println("------------------------------------------------------------------");
        System.out.println("Product ID \tName \t\tQuantity \tUnitPrice \tTotal");
        for(int i=0;i<pCount;i++){
            product[i].display();
        }
        System.out.println("-------------------------------------------------------------------");
        for(int i=0;i<pCount;i++){
            netAmount+=product[i].total;
        }
        System.out.println("\t\t\t\t\t\t\tNet Amount="+netAmount);
    }
}