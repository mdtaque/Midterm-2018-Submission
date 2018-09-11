package string.problems;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        System.out.println(isAnagram("ASIF","SIFA"));

    }

        public static boolean isAnagram(String st1, String st2){
            if(st1.length()!= st2.length()){
                return false;
            }

            st1 = st1.toUpperCase();
            st2 = st2.toUpperCase();
            char[] strrr1 = st1.toCharArray();
            Arrays.sort(strrr1);
            char[] strrr2 = st2.toCharArray();
            Arrays.sort(strrr2);
            return Arrays.equals(strrr1, strrr2);
        }
    }

