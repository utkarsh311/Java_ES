import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorLambda {
    public static void  main(String[] args) {

    ArrayList<Integer> nums= new ArrayList<>();
    nums.add(56);
    nums.add(19);
    nums.add(92);
    nums.add(24);

    //Converting implementation of compare() using anonymous class to lambda fucntion since Comparator is a Functional Interface
    Comparator<Integer> com= (i,j) -> i%10 > j%10?1:-1;
    

    Collections.sort(nums,com);
    System.out.println(nums);
 }
}