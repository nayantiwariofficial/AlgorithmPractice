/*
You're given strings J representing the types of stones that are jewels,
and S representing the stones you have.  Each character in S is a type of stone you have.
You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters.
 Letters are case sensitive, so "a" is considered a different type of stone from "A".*/


public class JewelsAndStones {

    public static int numJewelsInStones(String J, String S) {

        int count = 0;

        if (J.length() == 0 || S.length() == 0) {
            return 0;
        }

        for (int i = 0; i < J.length(); i++) {
            for (int j = 0; j < S.length(); j++) {
                if (S.charAt(j) == J.charAt(i)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("Aa", "aaaAAAbbb"));
    }
}
