package wired_java_array;

import java.util.Arrays;
import java.util.List;
public class WiredJavaArray {
    @SuppressWarnings("unchecked")
     public static  List<Integer>[] arrayOfLists =(List<Integer>[]) new List[3];
        static {
            arrayOfLists[0] = Arrays.asList(1, 2, 3);
            arrayOfLists[1] = Arrays.asList(4, 5, 6);
            arrayOfLists[2] = Arrays.asList(7, 8, 9);
        }

}
