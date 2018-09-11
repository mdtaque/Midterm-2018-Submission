package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        String word1 = "MOM";
        checkPalindrome(word1);
        checkPalindrome("NAA");

    }
    public static void checkPalindrome(String word){
        String actual = word.toLowerCase();
        String reverse = "";

        for(int i= actual.length()-1; i >= 0; i--){
            reverse = reverse + actual.charAt(i);
        }
        if(actual.equals(reverse)){
            System.out.println(word + " is a palindrome");
        }else{
            System.out.println(word + " is not a palindrome");
        }

    }
}
