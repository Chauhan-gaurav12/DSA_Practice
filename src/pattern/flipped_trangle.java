package pattern;

public class flipped_trangle {
    public static void main(String[] args){
        int n=6;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<=n;j++){
//               if((i+j)>n) System.out.print("* ");
//               else System.out.print("  ");
//            }
//            System.out.println();

        // second method
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n-1;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print((j)+" ");
            }
            System.out.println();
        }
    }
}
