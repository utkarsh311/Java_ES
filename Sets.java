import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<Integer> nums= new HashSet<Integer>();
        nums.add(9);
        nums.add(82);
        nums.add(24);
        nums.add(9);
        for(int n:nums)
        {
            System.out.println(n); // Hashset allows only unique elements to be store
        }

        System.out.println("Implementation of tree set"); 
        Set<Integer> values= new TreeSet<Integer>(); //To store and print values in ordering use TreeSet
        values.add(17);
        values.add(8);
        values.add((2));

        Iterator<Integer> val= values.iterator(); //We can use iterator() from Iterable interface to iterate over values and print instead of using for-each loop
        while(val.hasNext()) //Iterator has a method hasNext() to check if it has next values present or not
        {
            System.out.println(val.next()); //Iterator has next() to access/print next value, values printed are sorted/ordered since usng TreeSet
        }


    }
}
