package exception;

public class nullpointerexception {
    public static void main(String[] args){

        String st=null;
        try {
            System.out.println(st.toLowerCase());
        }
        catch(Exception e){
            System.out.println("Can not convert in lowercase"+e);
        }
    }
}
