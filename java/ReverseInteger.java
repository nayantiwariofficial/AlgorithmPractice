public class ReverseInteger {
    public static int reverse(int x) {
        int temp = x;
        if (x < 0) {
            temp = x * -1;
        }

        long reverse = 0;

        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        if (reverse > 2147483646 || reverse < -2147483647) {
            return 0;
        }

        if (x < 0)
            return (int)reverse * -1;
        else
            return (int)reverse;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}
