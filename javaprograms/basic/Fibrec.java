public class Fibrec {
    static int a=0,b=1,c;
    public static void main(String[] args){
        Fibrec ob = new Fibrec();
        ob.Fib1(10);
    }
    void Fib1(int i){
        if(i>=1){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            Fib1(i-1);
        }
    }
}
