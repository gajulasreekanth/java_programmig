import java.util.*;
public class Fact {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value");
        int n =sc.nextInt();
        int fact =1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("factorial of "+n+" is " +fact);
    }
}
