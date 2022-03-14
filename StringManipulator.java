package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringManipulator {
    public String removeVowels(String str)
    {

        if(str.equals(""))
            return "";
        else {
            Character vowels[] = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

            List<Character> al = Arrays.asList(vowels);

            StringBuffer sb = new StringBuffer(str);

            for (int i = 0; i < sb.length(); i++) {

                if (al.contains(sb.charAt(i))) {
                    sb.replace(i, i + 1, "");
                    i--;
                }
            }


            return sb.toString();
        }
//write the logic to remove all the vowels from the supplied input string
//and return that string
//if somebody calls this method with a null value then return the null
    }

}
