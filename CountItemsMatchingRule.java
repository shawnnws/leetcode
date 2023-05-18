package leetcode;
import java.util.List;

public class CountItemsMatchingRule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int columnToCheck;
        if (ruleKey.equals("type")) {
            columnToCheck = 0;
        }
        else if (ruleKey.equals("color")) {
            columnToCheck = 1;
        }
        else {
            columnToCheck = 2;
        }

        int matchCount = 0;
        for (List<String> item : items) {
            if (item.get(columnToCheck).equals(ruleValue)) {
                matchCount += 1;
            }
        }
        return matchCount;
    }
}
