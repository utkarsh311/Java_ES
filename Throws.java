public class Throws {
    public static void main(String[] args) {
        Hello obj= new Hello();
        try{
            obj.show();
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }

        System.out.println("bye");
    }
}

class Hello{
    public void show() throws ArithmeticException
    {
        int j=10/0;
    }
}


