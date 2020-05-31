package hackerRankTest;

import java.util.ArrayList;
import java.util.List;

public class Test {

    static List<String> dict = new ArrayList<>();

    public static void main(String[] args) {

        String str = "ilikesamsung";

        dict.add("i");
        dict.add("like");
        dict.add("samsung");

        System.out.println(wordBreak(str));

    }

    public static boolean wordBreak(String str) {
        int size = str.length();
        if (size == 0) {
            return true;
        } else {
            for (int i = 1; i <= str.length(); i++) {
                String prefix = str.substring(0, i);
                String suffix = str.substring(i, size);

                if (dict.contains(prefix) && wordBreak(suffix) == true)
                    return true;
            }
        }
        return false;
    }
}
