public class Leap {
    public static void main(String[] args){
        int a=2016;
        if((a%400==0) || (a%4==0 && a%100!=-0)){
            System.out.println("leap year");

        }
        else{
            System.out.println("not leap year");
        }

    }
}
