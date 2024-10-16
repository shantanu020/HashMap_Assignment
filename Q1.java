import java.util.*;


public class Q1 {
    public static void main(String[] args) {
        TreeMap<Integer,String>tm=new TreeMap<>();
        //5- Rahul, 7 Lakshman, 1 Ram, 4 Krrish, 2 Lakshay, 
        tm.put(5, "Rahul");
        tm.put(7, "Lakshman");
        tm.put(1, "Ram");
        tm.put(4, "Krrish");
        tm.put(2, "Lakshay");
        for(Map.Entry<Integer,String> e:tm.entrySet()){
            System.out.println(e.getKey()+"- "+e.getValue());
        }
    }
}
