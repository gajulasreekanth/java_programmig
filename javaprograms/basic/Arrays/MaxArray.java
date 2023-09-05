public class MaxArray {
    public static void main(String[] args){
        int[] a={10,20,50,1,8,15};
        int Max=a[0];
        for(int i=1;i<a.length;i++){
            if(Max<a[i]){
                Max=a[i];
            }
        }
        System.out.println("Maximum is : "+Max);
    }
}
