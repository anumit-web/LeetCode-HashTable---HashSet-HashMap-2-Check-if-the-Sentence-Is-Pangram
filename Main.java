/*
rm *.class
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {

        System.out.println("Jewels and Stones");
        System.out.println("Solving problems using hashmap");
        System.out.println("");

        Solution solution = new Solution();

        String sentence1 = "thequickbrownfoxjumpsoverthelazydog";
        boolean return_value1 = solution.checkIfPangram(sentence1);

        System.out.println("Output , is it panagram  = " + return_value1); // how to print tree

        String sentence2 = "leetcode";
        boolean return_value2 = solution.checkIfPangram(sentence2);

        System.out.println("Output , is it panagram  = " + return_value2); // how to print tree

    }

}
