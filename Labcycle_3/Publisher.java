import java.util.Scanner;
class Publisher{
	String pname;
	Publisher(String n)
	{
		pname=n;
	}
}

class Book extends Publisher{
	String bookName,author;
	int bookPrice;
	Book(String n,String bn,String a,int bp){
		super(n);
		bookName=bn;
		author=a;
		bookPrice=bp;
	}	
}

class Literature extends Book{
	Literature(String n,String a,String bn,int bp){
		super(n,a,bn,bp);
	}
	void display(){
		System.out.println();
		System.out.println("Book Name :"+bookName+" Author :"+author+" Publisher :"+pname+" Book Price :"+bookPrice);
	}
}

class Fiction extends Book{
	Fiction(String bn,String a,String n,int bp){
		super(bn,a,n,bp);
	}
	void display(){
		System.out.println();
		System.out.println("Book Name :"+bookName+" Author :"+author+" Publisher :"+pname+" Book Price :"+bookPrice);
	}
}

class HierarchicalInheritance{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Book details (Literature)");
		System.out.print("Enter the publisher name :");
		String publisherName=sc.next();
		System.out.print("Enter the author name :");
		String authorName=sc.next();
		System.out.print("Enter the book name :");
		String bookName=sc.next();
		System.out.print("Enter the Book price :");
		int price=sc.nextInt();

		System.out.println("\nEnter the Book details (Fiction)");
		System.out.print("Enter the publisher name :");
		String publisherName1=sc.next();
		System.out.print("Enter the author name :");
		String authorName1=sc.next();
		System.out.print("Enter the book name :");
		String bookName1=sc.next();
		System.out.print("Enter the Book price :");
		int price1=sc.nextInt();
		
		Literature obj1 =new Literature(publisherName,authorName,bookName,price);
		obj1.display();

		Fiction obj2=new Fiction(publisherName1,authorName1,bookName1,price1);
		obj2.display();
		
	}
}
