import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsComparator {
    public static void main(String[] args) {
        ArrayList<Integer> nums= new ArrayList<>();
        nums.add(56);
        nums.add(19);
        nums.add(92);
        nums.add(24);

        Collections.sort(nums);
        System.out.println(nums);

        //Now if we want to sort based on our logic say on String length we use Comapartaor Interface

        ArrayList<String> val= new ArrayList<>();
        val.add("Hello");
        val.add("Hi");
        val.add("HelloHiHow");
        val.add("Hey");

        Comparator<String> com= new Comparator<String>() {
            public int compare(String a, String b)
            {
                if(a.length()>b.length())
                {
                    return 1;
                }
                else{
                    return  -1;
                }
            }
        };

        Collections.sort(val,com);
        System.out.println("Printing sorted String list based on length:");
        System.out.println(val);
    }
}
