import java.util.Scanner;
public class Even {
    public static void main(String args[]) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check Odd or Even: ");
        a = sc.nextInt();

        if (a %2 == 0)
        {
            System.out.println(a+ " is Even");
        }
        else{
            System.out.println(a+ " is odd");
        }

    }
}

