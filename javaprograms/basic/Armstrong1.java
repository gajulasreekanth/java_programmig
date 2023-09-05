import java.util.*;
public class Armstrong1 {
     
    public static void main(String[] args){
        int r, sum=0,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value");
        int num=sc.nextInt();
        temp=num;
        while(num>0){
            r=num%10;
            num=num/10;
            sum=sum+r*r*r;
        }
        if(temp==sum){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not Armstrong number");
        }
        
    }
    
}
