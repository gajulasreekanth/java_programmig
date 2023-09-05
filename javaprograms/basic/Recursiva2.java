import java.util.*;
public class Recursiva2 {
    static int fact=1;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value");
        int no=sc.nextInt();
        Recursiva2 ob = new Recursiva2();
        ob.calcfact(no);
        System.out.println("factorial of  " +no+ " is " + fact);

    }
    void calcfact(int no){
        if(no>=1){
            fact=fact*no;
            calcfact(no-1);
        }
    }

    
}
