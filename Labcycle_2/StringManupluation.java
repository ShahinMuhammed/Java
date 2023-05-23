import java.util.Scanner;

class StringManupluation
{
	static void manipulate(String str)
	{
		String temp=str;
		System.out.println("\nString manipulation with string class\n");
		System.out.println("First character is : "+temp.charAt(0));
		temp=temp.concat("concatenated");
		System.out.println("Concat operation : "+temp);
		System.out.println("Length of the string : "+temp.length());
		System.out.println("String to UPPER case "+temp.toUpperCase());
		System.out.println("String to lower case "+temp.toLowerCase());
		System.out.println("Replaced : "+temp.replace("concatenated","replaced"));
		System.out.println("Index of this  :"+temp.indexOf("this"));
	}
	static void manipulateBuffer(StringBuffer str)
	{
		StringBuffer tempSb=str;
		System.out.println("\nString manipulation using buffer class\n");
		tempSb=tempSb.append("Appended");
		System.out.println("Append : "+tempSb);
		System.out.println("Length is  :"+tempSb.length());
		System.out.println("Substring from 8th to last index 
:"+tempSb.substring(8));
		System.out.println("Substring from 0 to 4th index  :"+tempSb.substring(0,5));
	}
	public static void main(String args[])
	{
		String str=new String();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string");
		str=sc.nextLine();
		manipulate(str);
		StringBuffer sb=new StringBuffer(str);
		manipulateBuffer(sb);
	}
}