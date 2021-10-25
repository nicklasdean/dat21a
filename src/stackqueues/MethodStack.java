package stackqueues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MethodStack {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<String>();
        LinkedList<String> linked = new LinkedList<String>();

        getSizeOfList(arr);
        getSizeOfList(linked);
    }

    public static int getSizeOfList(List<String> list){
        return list.size();
    }
}




