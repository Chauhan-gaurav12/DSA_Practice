package string;
import java.util.*;
public class reverse_string {
    static String reverse_str(String s,int idx){
        if(idx==s.length())return "";
        char t=s.charAt(idx);
        String smallans=reverse_str(s,idx+1);
        return smallans+s.charAt(idx);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String:");
        String s=sc.nextLine();
        System.out.println(reverse_str(s,0));
    }
}
