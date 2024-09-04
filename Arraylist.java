import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Arraylist
{
    public static void main(String args[])
    {
        Collection<Integer> nums= new ArrayList<Integer>();
        nums.add(5);
        nums.add(7);
        nums.add(9);
        nums.add(2);

        System.out.println(nums);

        //Collection does not support index value hence using foreach loop
        for(int n : nums)
        {
            System.out.println(n);
        }

        //To access index value use List interface instead of Collection interface. List extends Collection
        List<Integer> nums1 =new ArrayList<Integer>();
        nums1.add(5);
        nums1.add(7);
        System.out.println(nums1.get(1)); //value at index 1 will get printed
        
    }

}