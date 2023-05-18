package leetcode;

public class SameLetterDistance {
    public boolean checkDistances(String s, int[] distance) {

        boolean wellSpaced = true;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(j) == s.charAt(i)) {
                    int firstInstance = i;
                    int secondInstance = j;

                    int distanceBetween = secondInstance - firstInstance - 1;
                    int indexToCheck = (int) s.charAt(i) - (int) 'a';
                    if (distance[indexToCheck] != distanceBetween) {
                        wellSpaced = false;
                    }
                }
            }
        }
        return wellSpaced;
    }

    public static void main(String[] args) {
        String s = "abaccb";
        int[] distance = {1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        SameLetterDistance solution = new SameLetterDistance();
        solution.checkDistances(s, distance);
        System.out.println(solution.checkDistances(s, distance));
    }
}
