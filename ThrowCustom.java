public class ThrowCustom {
    public static void main(String[] args) {
        int i=0;
        try{
            if(i==0){
                throw  new UtkarshException("This is my exception");
            }
        }
        catch(UtkarshException e)
        {
            System.out.println(e);
        }
    }
}

class UtkarshException extends Exception
{
    public UtkarshException(String str)
    {
        // calling constructor of Exception class to print our desired message
        super(str); 
    }
}
