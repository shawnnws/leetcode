package leetcode;

import java.util.HashSet;

public class UniqueEmailAddress {

    /*
    Design a function to do the cleaning of all email address.
     */
    public String stripEmail(String email) {
        String local = "";
        String domain = "";
        String strippedEmail = "";

        int separator = email.indexOf('@');

        // If local part has "+", we only take in the part before it.
        if (email.contains("+")) {
            int localEndIndex = email.indexOf('+');
            local = email.substring(0, localEndIndex);
        }
        // If not, we take the whole part before "@".
        else {
            local = email.substring(0, separator);
        }
        // Strip the "." from the local part.
        local = local.replace(".", "");

        // Domain will be everything after "@".
        domain = email.substring(separator + 1);
        // Combine everything together to form the cleaned email.
        strippedEmail = local + "@" + domain;
        return strippedEmail;
    }

    public int numUniqueEmails(String[] emails) {
        // Instantiate a HashSet to keep track of non-duplicate email addresses after cleaning.
        HashSet<String> uniqueEmails = new HashSet<String>();

        //Clean each email in Array and add into the HashSet.
        for (String email : emails) {
            email = stripEmail(email);
            uniqueEmails.add(email);
        }
        // Size of HashSet will be the answer as HashSet will only contain non-duplicates.
        return uniqueEmails.size();
    }

    public static void main(String[] args) {
        String[] emails = {"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
        UniqueEmailAddress solution = new UniqueEmailAddress();
        int answer = solution.numUniqueEmails(emails);
        System.out.println(answer);
    }
}
