import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static int romanToInt(String s) {

        char[] charArray = s.toCharArray();
        int solution = 0;

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int n = charArray.length - 1;
        int i = 0;

        if ((n + 1) == 1) {
            return map.get(charArray[0]);
        }

        if(map.get(charArray[n]) <= map.get(charArray[n-1])){
            solution = map.get(charArray[n]);
        }

        while (i < charArray.length - 1) {
            if (map.get(charArray[i]) < map.get(charArray[i + 1])) {

                solution += map.get(charArray[i + 1]) - map.get(charArray[i]);
                i++;

            } else {

                solution += map.get(charArray[i]);
            }
            i++;
        }
        return solution;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("I"));
    }
}
