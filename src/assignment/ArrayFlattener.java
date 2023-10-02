package assignment;

import java.util.ArrayList;
import java.util.List;


public class ArrayFlattener {

    public static int[] flattenArray(int[][] input) {
        if (input == null) {
            return null;
        }

        List<Integer> flattenedList = new ArrayList<>();

        for (int[] innerArray : input) {
            if (innerArray != null) {
                for (int num : innerArray) {
                    flattenedList.add(num);
                }
            }
        }

        int[] flattenedArray = new int[flattenedList.size()];
        for (int i = 0; i < flattenedList.size(); i++) {
            flattenedArray[i] = flattenedList.get(i);
        }

        return flattenedArray;
    }

//    public static void main(String[] args) {
//        System.out.println("Hello world!");}
}
