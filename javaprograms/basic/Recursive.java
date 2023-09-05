import java.util.Scanner;

public class Recursive {
    int calcfact(int no){
        if(no>=1){
            return(no*calcfact(no-1));
        }
        return 1;
    
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value");
        int no=sc.nextInt();
        Recursive ob = new Recursive();
        int fact=ob.calcfact(no);
        System.out.println("factorial of " +no+ " is " + fact);
    }
}
