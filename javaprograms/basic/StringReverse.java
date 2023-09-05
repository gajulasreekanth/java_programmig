import java.util.*;
public class StringReverse {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("enter a name");
       String name=sc.next();
        int n = name.length();
        String rev="";
        for(int i=n-1;i>=0;i--){
          
            rev=rev+name.charAt(i);
        }
        System.out.println("Reverse of "+name+" is " +rev);
    }
}
