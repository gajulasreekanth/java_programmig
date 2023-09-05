public class MinArray {
    public static void main(String[] args){
        int[] a={10,20,50,1,8,15};
        int Min=a[0];
        for(int i=1;i<a.length;i++){
            if(Min>a[i]){
                Min=a[i];
            }
        }
        System.out.println("Minimum is : "+Min);
    }
}
