
import java.util.ArrayList;
import java.util.Collections;

public class Comparables {
    public static void main(String[] args) {

        ArrayList<Students> studs=new ArrayList<>();
        studs.add(new Students(28,"Utkarsh"));
        studs.add(new Students(22,"Ankit"));
        studs.add(new Students(17,"Rahul"));
        studs.add(new Students(49,"Shubham"));

        Collections.sort(studs);
        for (Students s : studs) {
            System.out.println(s.name+" "+s.age);
        }
        
    }
}

class Students implements Comparable<Students>{

    int age;
    String name;
    
    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }
    
    @Override
    public int compareTo(Students that) {
        return this.age>that.age?1:-1;
    }

}
