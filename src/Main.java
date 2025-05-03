public class Main {
    public static void main(String[] args) {

        String racecar = "RACECAR";
        Palindrome tester = new Palindrome();

        boolean isPalindrome = tester.isPalindrome(racecar);

        if (isPalindrome) {
            System.out.println("Is a palindrome");
        } else {
            System.out.println("Is not a palindrome");
        }



    }
}