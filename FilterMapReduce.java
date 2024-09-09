import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterMapReduce {

    public static void main(String[] args) {
        
        ArrayList<Integer> nums= new ArrayList<>();
        nums.add(10);
        nums.add(7);
        nums.add(9);
        nums.add(4);

        Predicate<Integer> p= n->n%2==0; //Lambda expression for implementation of test() of predicate functional interface

        Stream<Integer> s1= nums.stream();
        Stream<Integer> s2= s1.filter(n->n%2==0); //Filter function takes an object of Predicate Interface as a parameter
        //thus we can pass either p or  n->n%2==0;  inisde the filter fucntion, both works
        System.out.println("Printing filter values");
        s2.forEach(n->System.out.println(n)); //Output is only even values

        //MAP implementation

        Function<Integer,Integer> f = n->n*2; //Lambda expression for implementation of apply() of funtion functional interface
        Stream<Integer> s3= nums.stream(); //Copying nums value to new stream s3
        Stream<Integer> s4= s3.map(f); //Map takes object of Fucntion functional interface as parameter
        //thus we can pas f or  n->n*2 directly as we did in filter
        System.out.println("Showing Map outputs");
        s4.forEach(n->System.out.println(n));  

        //Reduce implementation
        Stream<Integer> s5= nums.stream();
        int result= s5.reduce(0,(c,e)->c+e); //0 is inital value and c,e is the values on which operation will happen
        //c+e is the operation that will happen.See notebook for detailed explanation.
        System.out.println("Reduce output is:"+ result);

        //ALL combined together
        Stream<Integer> s6= nums.stream(); //Since streams can only be used once hence copying nums value to a new stream for each new operation
        int res=s6.filter(n->n%2==0).map(n->n*2).reduce(0,(c,e)->c+e);
        System.out.println("Output after applying filter, then map and then reduce on same stream s6:");
        System.out.println(res); //op is 28(10*2+4*2)

        //Using multithreading in Streams
        Stream<Integer> s7= nums.stream();
        Stream<Integer> s8=s7.parallel().filter(n->n%2==1);
        System.out.println("Ouutput of filter using multithreading");
        s8.forEach(n->System.out.println(n));

        
    }
    
}
