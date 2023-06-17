package leetcode;

public class CrawlerLogFolder {
    public int minOperations(String[] logs) {

        /*
        For this solution, we assume that any other expressions other than "../" and "./" will
        refer to a file name regardless of the naming convention.
         */

        int numFromMain = 0;

        for (String log : logs) {
            // If the log starts with "../", we then check if numFromMain is 0. If it is not, we deduct 1 from numFromMain.
            if (log.startsWith("../")) {
                if (numFromMain != 0)
                    numFromMain--;
            }
            // Any other expressions other than "./", we assume to be legit access to a folder, and add 1 to numFromMain.
            else if (!log.startsWith("./")){
                numFromMain++;
            }
        }
        return numFromMain;
    }

    public static void main(String[] args) {
        String[] logs = {"./","../","./"};
        CrawlerLogFolder solution = new CrawlerLogFolder();
        int answer = solution.minOperations(logs);
        System.out.println(answer);
    }
}
