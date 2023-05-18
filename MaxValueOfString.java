package leetcode;

public class MaxValueOfString {

    boolean onlyNumeric(String element) {
        boolean isNumeric = true;
        for (int i = 0; i < element.length(); i++) {
            if (!element.matches("^[0-9]*$")) {
                isNumeric = false;
            }
        }
        return isNumeric;
    }

    public int maximumValue(String[] strs) {

        int maxValue = 0;
        int convertedValue = 0;

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() == 0) {
                convertedValue = strs[i].length();
            }
            else if (onlyNumeric(strs[i])) {
                convertedValue = Integer.parseInt(strs[i]);
                if (convertedValue > maxValue) {
                    maxValue = convertedValue;
                }
            } else {
                convertedValue = strs[i].length();
                if (convertedValue > maxValue) {
                    maxValue = convertedValue;
                }
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        String[] strs = {"alic3","bob","3","4","00009",""};
        MaxValueOfString solution = new MaxValueOfString();
        System.out.println(solution.maximumValue(strs));
    }
}
