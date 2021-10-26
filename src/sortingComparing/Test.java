package sortingComparing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>(
                Arrays.asList(3,1,5,6,2,3,5,6,7)
        );
        System.out.println(myList);
        Collections.sort(myList);
        System.out.println(myList);
    }
}
