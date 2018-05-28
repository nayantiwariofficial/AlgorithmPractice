import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArraysIIWithoutUsingMaps {

        public static int[] intersection(int[] nums1, int[] nums2) {

            Arrays.sort(nums1);
            Arrays.sort(nums2);

            int[] res = new int[Math.min(nums1.length, nums2.length)];

            int i = 0;
            int j = 0;
            int k = 0;

            while (i < nums1.length && j < nums2.length) {
                if (nums1[i] == nums2[j]) {
                    res[k] = nums1[i];
                    i++;
                    j++;
                    k++;
                } else if (nums1[i] < nums2[j]) {
                    i++;
                } else
                    j++;
            }


            return Arrays.copyOfRange(res, 0, k);
        }

        public static void main(String[] args) {
            int[] num1 = {1, 2};
            int[] num2 = {1, 1};

            int[] res;
            res = intersection(num1, num2);

            if (res != null) {
                for (int i = 0; i < res.length; i++) {
                    System.out.println(res[i]);
                }
            } else {
                System.out.println("No intersection");
            }
        }

}
