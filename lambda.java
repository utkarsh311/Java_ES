class lambda{
    public static void main(String[] args) {
        //Using inner annonymous class
        Hello obj= new Hello(){
            @Override
            public int add(int i, int j){
                return i+j;
            }
        };
            int res=obj.add(6,9);
            System.out.println(res);
        
        //Using lambda function
        Hello obj1=(i,j)->{
            return i+j;
        };
        int res1=obj1.add(4,5);
        System.out.println(res1);
    }
}



interface  Hello{
   int add(int i, int j);
}