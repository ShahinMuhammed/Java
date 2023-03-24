import java.util.Scanner;

class Product {
    int Pcde,Price;
    String Pnm;
    Product(int Pcode, String Pname, int price)
    {
        Pcde = Pcode;
        Pnm = Pname;
        Price = price;

    }
    static void Compare(Product pd1,Product pd2,Product pd3)
    {   
         
    	   if(pd1.Price > pd2.Price && pd1.Price>pd3.Price)
        {
            System.out.println("Price of Product 1 is greater");
        }
        else if(pd1.Price < pd2.Price && pd2.Price>pd3.Price)
        {
            System.out.println("The price of Product 2 is greater");
        }
        else if(pd1.Price<pd2.Price && pd2.Price<pd3.Price)
        {
            System.out.println("The price of Product 3 is greater");
        }

    
    }

    public static void main(String args[])
    {
    	  Scanner val = new Scanner(System.in);
    	  System.out.print("Enter the product code1:");
    	  int pcde=val.nextInt();
    	  System.out.print("Enter the product Name1:");
    	  String pnme=val.next();
    	  System.out.print("Enter the Price1:");
    	  int prc=val.nextInt();
    	  
    	  System.out.print("Enter the product code2:");
    	  int pcde1=val.nextInt();
    	  System.out.print("Enter the product Name2:");
    	  String pnme1=val.next();
    	  System.out.print("Enter the Price2:");
    	  int prc1=val.nextInt();
    	  
    	   System.out.print("Enter the product code3:");
    	  int pcde2=val.nextInt();
    	  System.out.print("Enter the product Name3:");
    	  String pnme2=val.next();
    	  System.out.print("Enter the Price3:");
    	  int prc2=val.nextInt();
    	  
    	   Product pd1 = new Product(pcde,pnme,prc);
        Product pd2 = new Product(pcde1,pnme1,prc1);
        Product pd3 = new Product(pcde2, pnme2, prc2);
        Compare(pd1,pd2,pd3);   
	
    }
}

