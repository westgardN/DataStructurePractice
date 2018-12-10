

import java.util.HashMap;
import java.util.Map;
/**
 * Put and get are the basic functions for the HashMap. This map does nto retain order.
 * Created by nicolewestgard on 12/9/18.
 */
public class HashMapEx {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(2, "Morty");
        map.put(3, "Summer");
        map.put(4, "Rick");
        map.put(5, "Jerry");
        map.put(1, "Beth");
        map.put(7, "Pickle Rick");
        map.put(8, "Rat King");

        //To set the key to a variable
        String text = map.get(7);

        //Iterate through the entries in the map use the foreach loop
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + " : " + value);
        }





    }

}
