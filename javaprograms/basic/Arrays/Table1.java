import java.util.Scanner;

public class Table1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int a=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(a+ " x 9" +i+" = "+a*i);
        }
    }
}
