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
	Literature(String n,String bn,String a,int bp){
		super(n,bn,a,bp);
	}
	void display(){
		System.out.println("Book Name :"+bookName+"\nAuthor :"+author+"\nPublisher :"+pname+"\nBook Price :"+bookPrice);
	}
}

class Fiction extends Book{
	Fiction(String n,String bn,String a,int bp){
		super(n,bn,a,bp);
	}
	void display(){
		System.out.println("Book Name :"+bookName+"\nAuthor :"+author+"\nPublisher :"+pname+"\nBook Price :"+bookPrice);
	}
}

class HierarchicalInheritance{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Book details (Literature)");
		System.out.print("Enter the publisher name :");
		String publisherName=sc.nextLine();
		System.out.print("Enter the author name :");
		String authorName=sc.nextLine();
		System.out.print("Enter the book name :");
		String bookname=sc.nextLine();
		System.out.print("Enter the price of the book :");
		int price=s.nextInt();
		
		Literature obj =new Literature(publisherName,bookname,authorName,price);
		obj.display();

		System.out.println("\nEnter the Book details (Fiction)");
		System.out.print("Enter the publisher name :");
		String publisherName1=sc.nextLine();
		System.out.print("Enter the author name :");
		String authorName1=sc.nextLine();
		System.out.print("Enter the book name :");
		String bookname1=sc.nextLine();
		System.out.print("Enter the price of the book :");
		int price1=s.nextInt();

		Fiction obj1 =new Fiction(publisherName1,bookname1,authorName1,price1);
		obj1.display();
		
	}
}
