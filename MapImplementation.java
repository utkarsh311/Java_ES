import java.util.HashMap;
import java.util.Map;
public class MapImplementation {
    
    public static void main(String[] args) {
        
        Map<String,Integer> students= new HashMap<>(); //Map in java is key-0value pair similar to dictinary in python
        students.put("Utkarsh",92);
        students.put("Ankit",97);
        students.put("Rahul",82);
        students.put("saurabh",79);
        students.put("Utkarsh",99); //keys are unique in a map

        System.out.println(students);
        
        //To print all keys
        System.out.println(students.keySet());

        //To iterate over map and print values 

        for(String key : students.keySet())
        {
            System.out.println(key +":"+students.get(key));
        }

    }
}

