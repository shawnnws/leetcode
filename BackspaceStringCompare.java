package leetcode;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {

        StringBuilder stringOfS = new StringBuilder();
        StringBuilder stringOfT = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#' && stringOfS.length() != 0) {
                stringOfS.deleteCharAt(stringOfS.length() -1);
            }
            else if (s.charAt(i) == '#' && stringOfS.length() == 0) {
                continue;
            }
            else {
                stringOfS.append(s.charAt(i));
            }
            System.out.println("CurrentS: " + stringOfS);
        }
        System.out.println("stringOfS: " + stringOfS);

        for (int h = 0; h < t.length(); h++) {
            if (t.charAt(h) == '#' && stringOfT.length() != 0) {
                stringOfT.deleteCharAt(stringOfT.length() -1);
            }
            else if (t.charAt(h) == '#' && stringOfT.length() == 0) {
                continue;
            }
            else {
                stringOfT.append(t.charAt(h));
            }
            System.out.println("CurrentT: " + stringOfT);
        }
        System.out.println("stringOfT: " + stringOfT);

        return stringOfS.toString().equals(stringOfT.toString());
    }

    public static void main(String[] args) {
        String s = "a##b";
        String t = "#a#b";
        BackspaceStringCompare solution = new BackspaceStringCompare();
        boolean value = solution.backspaceCompare(s, t);
        System.out.println(value);
    }
}
