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
	Book(String bn,int bp,String n,String a){
		super(n);
		bookName=bn;
		author=a;
		bookPrice=bp;
	}	
}

class Literature extends Book{
	Literature(String bn,String a,String n,int bp){
		super(bn,a,n,bp);
	}
	void display(){
		System.out.println("Book Name :"+bookName+"Author :"+author+"Publisher :"+pname+"Book Price :"+);
	}
}

class Fiction extends Book{
	Fiction(String bn,String a,String n,int bp){
		super(bn,a,n,bp);
	}
	void display(){
		System.out.println("Book Name :"+bookName+"Author :"+author+"Publisher :"+pname+"Book Price :"+);
	}
}

class HierarchicalInheritance{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Book details (Literature)");
		String publisherName=sc.next();
		System.out.print("Enter the publisher name :");
		String authorName=sc.next();
		System.out.print("Enter the book name :");
		String bookName=sc.next();
		System.out.print("Enter the Book price :");
		String price=sc.nextInt();
		
		Literature obj =new Literature(publisherName,authorName,bookn,price);
		obj.display();

		Fiction obj =new Fiction(publisherName,authorName,bookName,price);
		obj.display();
		
	}
}
