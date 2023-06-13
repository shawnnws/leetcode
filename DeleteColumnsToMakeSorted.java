package leetcode;

public class DeleteColumnsToMakeSorted {
    public int minDeletionSize(String[] strs) {
        int numColumns = strs[0].length();
        int numDelete = 0;

        for (int i = 0; i < numColumns; i++) {
            boolean isLex = true;
            for (int j = 0; j < strs.length - 1; j++) {
                if ((int) strs[j + 1].charAt(i) < (int) strs[j].charAt(i)) {
                    isLex = false;
                }
            }

            if (!isLex) {
                numDelete += 1;
            }
        }
        return numDelete;
    }
}
