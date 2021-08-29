package b12_java_collection.thuchanh.map_student_for_age;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> studentMap= new HashMap<>();
        studentMap.put("Tung",24);
        studentMap.put("Tu",22);
        studentMap.put("Anh",19);
        studentMap.put("Hong",23);
        Set<Map.Entry<String,Integer>> listEntry=studentMap.entrySet();
        for(Map.Entry<String,Integer> entry : listEntry){
            System.out.println("Name: "+entry.getKey()+" Age: "+entry.getValue());
        }

        //Sort by key
        Map<String,Integer> studentTree=new TreeMap<>(studentMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(studentTree);

        Map<String, Integer> studentLinked=new LinkedHashMap<>();
        studentLinked.put("Tung",24);
        studentLinked.put("Tu",22);
        studentLinked.put("Anh",19);
        studentLinked.put("Hong",23);
        System.out.println("\nThe age for " + "Hong is " + studentLinked.get("Hong"));

    }
}
