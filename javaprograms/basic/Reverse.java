import java.util.*;
public class Reverse {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter a value");
        int n=s.nextInt();
        int rev=0;
        int rem;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.print(rev);
    }
}
