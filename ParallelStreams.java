
import java.util.ArrayList;
import java.util.Random;

public class ParallelStreams {

    public static void main(String[] args) {
        
        int size=10000;
        ArrayList<Integer> nums = new ArrayList<Integer>(size);
         Random ran= new Random();
         for(int i=0;i<size;i++)
         {
            nums.add(ran.nextInt(100));
         }

         //Using Normal streams and noting the start time and end time to calculate the entire tike taken for normal stream

         long startstream= System.currentTimeMillis();
         int res1=nums.stream().map(n-> 
         {
            try{
            Thread.sleep(1);
            }    
            catch(Exception e){} 
            return n*2 ;
        })
         .reduce(0,(c,e)-> c+e);
         long endStream= System.currentTimeMillis();

         //Using Parralel streams and noting the start time and end time to calculate the entire tike taken for normal stream

         long startParallel= System.currentTimeMillis();
         int res2=nums.parallelStream().map(n-> 
         {
            try{
            Thread.sleep(1);
            }    
            catch(Exception e){} 
            return n*2 ;
        })
        .reduce(0,(c,e)-> c+e);
        long endParallel= System.currentTimeMillis();

         System.out.println(res1 + " " + res2);
         System.out.println("Time taken by normal Stream in ms: "+ String.valueOf(endStream-startstream));
         System.out.println("Time taken by parallel Stream in ms: "+ String.valueOf(endParallel-startParallel));
    }
    

}
