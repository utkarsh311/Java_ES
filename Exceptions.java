public class Exceptions {
 public static void main(String[] args) {
    //Try catch and multiple catch
    //Based on the exception in try block it will execute the appropriate catch block
     int i=5;
     int arr[]=new int[5];
     try {
         int j =20/5;
         System.err.println(arr[7]);
     } 
     catch (ArithmeticException e){
        System.out.println("Don't divide by 0" + e);
     }
     catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Index 7 is not available" + "\n"+e);
     }
     catch (Exception e) {
        System.out.println(e);
     }
 }   
}
