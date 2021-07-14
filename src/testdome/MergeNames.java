package testdome;

import java.util.ArrayList;
import java.util.List;

public class MergeNames {
    
    public static String[] uniqueNames(String[] names1, String[] names2) {
        //throw new UnsupportedOperationException("Waiting to be implemented.");
    	List<String> op= new ArrayList<>();
    	 
    	for(int i=0; i<names1.length; i++ ) {
    		if(!op.contains(names1[i])){
    			op.add(names1[i]);
    		}
    		if(!op.contains(names2[i])){
    			op.add(names1[i]);
    		}
    	}
    	
    	return (String[]) op.toArray();
        
    }
    
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}