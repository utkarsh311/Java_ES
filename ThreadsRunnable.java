public class ThreadsRunnable {
    public static void main(String[] args) {

        /* 
        See NOTEBOOK for what is Thread class and Runnable interface for concepts.
        Implementing multiple threads using lambda function using Runnable interface.
        Instead of defining 2 class and implementing Runnable interface, since Runnable is a functional interface,
        i.e only one fucntion i.e run().
        Hence using lambda function to acheive multiple threading.
        */

        Runnable obj1= ()->{
            for (int i=0;i<10;i++){
                System.err.println("Hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };

        Runnable obj2=()->{
            for (int i=0;i<10;i++){
                System.err.println("Hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        };

        Thread t1= new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
    
}

// class A implements  Runnable{
//     public void run(){
//         for (int i=0;i<10;i++){
//             System.err.println("Hi");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 // TODO Auto-generated catch block
//                 e.printStackTrace();
//             }
//         }
//     }
// }
// class B implements  Runnable{
//     public void run(){
//         for (int i=0;i<10;i++){
//             System.err.println("Hello");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 // TODO Auto-generated catch block
//                 e.printStackTrace();
//             }
//         }
//     }
// }