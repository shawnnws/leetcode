package leetcode;

/*
- 0 to 9 : Phone number of passenger
- 10 : Gender
- 11 to 12 : Age
- 13 to 14 : Seat Number
 */

public class NumSeniorCitizens {

    public int  countSeniors(String[] details) {

        int count = 0;

        for (String detail : details) {
            int age = Integer.parseInt(detail.substring(11, 13));
            if (age > 60) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] details = {"1313579440F2036","2921522980M5644"};
        NumSeniorCitizens solution = new NumSeniorCitizens();
        System.out.println(solution.countSeniors(details));
    }

}
