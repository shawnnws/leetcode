package leetcode;
import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;
//import java.util.Collections;
//
//public class SortThePeople {
//    public String[] sortPeople(String[] names, int[] heights) {
//
//
//        int getSize = names.length;
//        HashMap<Integer, String> hashGroup = new HashMap<>(getSize);
//        String[] sortedNames = new String[getSize];
//
////Pair names to height.
//        for (int i = 0; i < getSize; i++) {
//            hashGroup.put(heights[i], names[i]);
//        }
//
////Reverse sort heights.
//        Arrays.sort(heights);
//        ArrayList<Integer> boxedHeights = new ArrayList<>();
//
//        for (int i = 0; i < getSize; i++) {
//            boxedHeights.add(heights[i]);
//        }
//        Collections.reverse(boxedHeights);
//
//        for (int i = 0; i < getSize; i++) {
//            sortedNames[i] = hashGroup.get(boxedHeights.get(i));
//        }
//        return sortedNames;
//    }
//}


public class SortThePeople {

    public String[] sortPeople(String[] names, int[] heights) {

        int getSize = names.length;
        String[] sortedNames = new String[getSize];

        HashMap<Integer, String> heightToName = new HashMap<Integer, String>();

        for (int i = 0; i < names.length; i++) {
            heightToName.put(heights[i], names[i]);
        }

        Arrays.sort(heights);
//        System.out.println(Arrays.toString(heights));
        for (int j = 0; j < getSize / 2; j++) {
            int temp = heights[j];
            heights[j] = heights[getSize - j - 1];
            heights[getSize - j - 1] = temp;
        }
//        System.out.print(Arrays.toString(heights));

        for (int k = 0; k < getSize; k++) {
            sortedNames[k] = heightToName.get(heights[k]);
        }
//        System.out.print(Arrays.toString(sortedNames));
        return sortedNames;
    }

    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180, 165, 170};

        SortThePeople solution = new SortThePeople();
        solution.sortPeople(names, heights);
    }
}