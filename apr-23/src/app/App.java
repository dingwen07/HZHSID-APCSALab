package app;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Integer[] i = { 12, 45, 23, 27, 19, 26, 21, 10 };
        ArrayList<Integer> l = new ArrayList<Integer>(Arrays.asList(i));
        for (int j = l.size() - 1; j >= 0; j--) {
            if (l.get(j) % 2 == 0) {
                l.remove(j);
            }
        }
        System.out.println(l);
    }
}