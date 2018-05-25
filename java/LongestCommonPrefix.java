
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0)
            return "";

        String pre = strs[0];

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].indexOf(pre) != 0) {
                pre = pre.substring(0, pre.length() - 1);
            }
        }

        return pre;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flowi", "flowight"};
        System.out.println("Result: " + longestCommonPrefix(strs));
    }
}