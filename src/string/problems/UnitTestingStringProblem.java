package string.problems;

import org.testng.Assert;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.

        Assert.assertEquals(true,Anagram.isAnagram("ASIF","SIFA"));
        //Assert.assertEquals("biological",DetermineLargestWord.findTheLargestWord(""));
        //Assert.assertEquals(true,Palindrome.checkPalindrome("DAD"));
    }
}
