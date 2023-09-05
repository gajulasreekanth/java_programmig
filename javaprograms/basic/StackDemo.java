import java.util.Scanner;
import java.util.Stack;
public class StackDemo {
    public static void main(String[] args){
        Stack s = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value");
        int a = sc.nextInt();
        s.push(a);
        System.out.println(s);
    
    }
    
}
