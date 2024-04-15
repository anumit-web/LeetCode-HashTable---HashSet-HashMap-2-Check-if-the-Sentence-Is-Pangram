/*
rm *.class
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Solution {

    public boolean checkIfPangram(String sentence) {

        HashSet<Character> panagramHashSet = new HashSet<Character>();
        
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            panagramHashSet.add(ch);
        }

        if (panagramHashSet.size() == 26) {
            return true;
        } else {
            return false;
        }

    }

}
