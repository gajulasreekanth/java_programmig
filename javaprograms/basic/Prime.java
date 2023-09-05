import java.util.*;
public class Prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value");
        int n=sc.nextInt();
        int temp=0;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                temp=temp+1;
            }
        }
        if(n>0){
            System.out.println(n+ " no is prime");
        }
        else{
            System.out.println(n+ " no is not prime");
        }
    }
}
