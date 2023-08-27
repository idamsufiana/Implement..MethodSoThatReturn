import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeNames {
    
    public static String[] uniqueNames(String[] n1, String[] n2) {
        //throw new UnsupportedOperationException("Waiting to be implemented.");
        Set<String> mySet1 = new HashSet<String>(Arrays.asList(n1));
        Set<String> mySet2 = new HashSet<String>(Arrays.asList(n2));
        Set<String> union = new HashSet<String>(mySet1);
        union.addAll(mySet2);
        return  union.toArray(new String[union.size()]);
    
    }
    
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}