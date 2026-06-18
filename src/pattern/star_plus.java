package pattern;

public class star_plus {
    public static void main(String[] args){
        int n = 5;
        int loop = n / 2;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == loop || j == loop){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  "); // TWO spaces
                }
            }
            System.out.println();
        }

        // print binary number pattern
        for(int i = 0; i < n; i++){
            for(int j = 0; j <=i; j++){
                if((i+j)%2==0){
                    System.out.print("1"+" ");
                }
                else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }
}
