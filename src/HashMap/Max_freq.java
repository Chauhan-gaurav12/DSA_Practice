package HashMap;
import java.util.*;
public class Max_freq {
    public static void main(String[] args){
        int [] arr={1,2,3,6,1,5,1,4,4,4,4,9,5,2,5,1,3,4,8,9,4};
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i:arr){
            if(!freq.containsKey(i)){
                freq.put(i,1);
            }
            else{
                freq.put(i,freq.get(i)+1);
            }
        }
        System.out.println("Frequency of the array is ");
        System.out.println(freq);
        System.out.println("with for loop ");
        for( var el:freq.entrySet()){
            System.out.printf("No is %d and frequency is %d\n",el.getKey(),el.getValue());
        }
        int maxFreq=-1;
        int ans=0;
        for(var ch:freq.entrySet()){
            if(maxFreq<ch.getValue()) {
                maxFreq = ch.getValue();
                ans = ch.getKey();
            }
        }
        System.out.printf("Max frequency element is %d and frequency is = %d",ans,maxFreq);
    }
}
