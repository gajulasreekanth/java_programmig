import java.util.*;
public class Fib {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a value");
      int a = sc.nextInt();
      System.out.println("enter b value");
      int b = sc.nextInt();  
      
        int c;
     for(int i=1;i<=10;i++){
         c=a+b;
        System.out.print(" "+c);
        a=b;
        b=c;
     }
    }
}
