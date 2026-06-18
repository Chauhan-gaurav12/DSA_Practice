package pattern;

public class small_uppercase_square {
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i%2==0){
                    System.out.print((char) (i+97)+ " ");
                }
                else{
                    System.out.print((char)(i+65)+ " ");
                }
            }
            System.out.println();
        }
    }
}
