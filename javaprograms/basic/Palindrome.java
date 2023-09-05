import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value");
        int no =sc.nextInt();
        int temp=no;
        int rev=0,rem;
        while(temp!=0){
            rem=temp%10;
            rev=rem*10+rem;
            temp=temp/10;
        }
        if(no==rev){
            System.out.println(no+ " is palindrome number");
        }
        else{
            System.out.println(no+ " is not palindrome number");
        }
    }
}
