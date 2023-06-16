package leetcode;

import java.util.Arrays;

public class NumOfLinesToWriteString {
    public int[] numberOfLines(int[] widths, String s) {

        int[] result = new int[2];
        int lineCount = 1;
        int pixels = 0;

        /*
        Using Ascii value of alphabets, we get the index of each alphabet to
        know how many pixels to add according to widths array.
        i.e.
        (int) 'a' - (int) 'a' = 0
        (int) 'a' - (int) 'b' = 1
        (int) 'a' - (int) 'c' = 2
        so on and so forth...
         */
        for (int i = 0; i < s.length(); i++) {
            int widthIndex = (int) s.charAt(i) - (int) 'a';
            int currentWidth = widths[widthIndex];
            // If adding the width of the current char will result in pixels still being less than 100, proceed to add.
            if (pixels + currentWidth <= 100) {
                pixels += currentWidth;
            }
            // If not, then current char will start on new line, hence we reset pixels count to be width of current char.
            // Add 1 count to lineCount.
            else {
                pixels = currentWidth;
                lineCount++;
            }
        }
        // Final width count will naturally be the most updated pixels count.
        result[0] = lineCount;
        result[1] = pixels;
        return result;
    }

    public static void main(String[] args) {
        int[] widths = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s = "bbbcccdddaaa";

        NumOfLinesToWriteString solution = new NumOfLinesToWriteString();
        int[] answer = solution.numberOfLines(widths, s);
        System.out.println(Arrays.toString(answer));
    }
}
