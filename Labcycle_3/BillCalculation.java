import java.util.Scanner;

interface calculations{
    void calculate();
}

class BillCalculation implements calculations{
    
    public void calculate(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter orderNumber :");
        int orderNumber=sc.nextInt();
        System.out.print("Enter Date:");
        String date=sc.next();
        System.out.print("Enter ProductID :");
        int productId=sc.nextInt();
        System.out.print("Enter Name:");
        String name=sc.next();
        System.out.print("Enter Quantity:");
        int quantity=sc.nextInt();
        System.out.print("Unit price:");
        int unitPrice=sc.nextInt();
        int total=quantity*unitPrice;
        double netAmount=total;
        System.out.print("OrderNumber\tDate\t\tProduct ID\tName\t    Quantity\t   Unit Price\t  Total Price\t   Net Amount");
        System.out.println("\n"+orderNumber+"\t\t"+date+"    \t"+productId+"\t\t"+name+"\t\t"+quantity+"\t\t"+unitPrice+"\t\t"+total+"\t\t"+netAmount);
        //System.out.println("\nOrder Number :"+orderNumber+"\nDate :"+date+"\nProduct ID :"+productId+"\nName :"+name+"\nQuantity :"+quantity+"\nPrice per unit :"+unitPrice+"\nTotal price :"+total+"\nNet Amount :"+netAmount);
    }
    public static void main(String[] args) {
        BillCalculation obj=new BillCalculation();
        obj.calculate();
    }
}