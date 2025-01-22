public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "LEVEL";
        String str2 = "SATYAM";

        System.out.println(str1 + " is " + (isPalindrome(str1) ? "Palindrome" : "Not Palindrome"));
        System.out.println(str2 + " is " + (isPalindrome(str2) ? "Palindrome" : "Not Palindrome"));
    }
}
