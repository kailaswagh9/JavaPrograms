package javaProgramsPkg;
import java.util.*;
public class CountWordsFromString {
	
	    public static void main(String[] args) {
	        HashMap<String,Integer> hm = new HashMap<>();
	        String str = "Kailas Ramdas Ramdas Ramdas Wagh Wagh";
	        String[] split = str.split(" ");
	        for(int i=0;i<split.length;i++){
	             
	             if(hm.containsKey(split[i])){
	                 int count = hm.get(split[i]);
	                 hm.put(split[i],count+1);
	             }else{
	                 hm.put(split[i],1);
	             }
	             
	             
	        }
	        System.out.println(hm);
	       
	       
	    }
	}

