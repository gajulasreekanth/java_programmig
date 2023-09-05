public class Pattern6 {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int k=i-1;k>=1;k--){
                System.out.print(k+" ");
            }
            for(int l=1;l<=i;l++){
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }
}
