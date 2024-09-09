
import java.util.ArrayList;
import java.util.stream.Stream;

public class Streams_practical {
 
    public static void main(String[] args) {
        
        ArrayList<Integer> nums= new ArrayList<>();
        nums.add(5);
        nums.add(8);
        nums.add(17);
        nums.add(21);

        Stream<Integer> s1= nums.stream();
        //s1.forEach(n->System.out.println(n));

        System.out.println("Prinitng only the odd values:");
        Stream<Integer> s2= s1.filter(n->n%2==1);
        //s2.forEach(n->System.out.println(n));

         System.out.println("Printing doubled values of odd numbers");
         Stream<Integer> s3= s2.map(n->n*2);
         s3.forEach(n->System.out.println(n));

    }
}
