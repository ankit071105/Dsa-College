package HomeAssignment;

public class Q6 {
    public static boolean isPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return true;
        }

        if (s.charAt(0) == s.charAt(s.length() - 1)) {

            return isPalindrome(s.substring(1, s.length() - 1));
        }

        return false;
    }

    public static void main(String[] args) {
     
        String palindrome1 = "racecar";
        String palindrome2 = "gohangasalamiimalasagnahog";
        String notPalindrome = "hello";
        System.out.println(palindrome1 + " is a palindrome: " + isPalindrome(palindrome1)); // Output: true
        System.out.println(palindrome2 + " is a palindrome: " + isPalindrome(palindrome2)); // Output: true
        System.out.println(notPalindrome + " is a palindrome: " + isPalindrome(notPalindrome)); // Output: false
    }
}
