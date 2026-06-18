package pattern;

public class number_spiral {
    public static void main(String[] args){
        int n=7;

        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=2*n-1;j++){
                int a=i,b=j;
                if(a>n) a=2*n-a;
                if(b>n) b=2*n-b;

                int value = n - Math.min(a, b) + 1;
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
