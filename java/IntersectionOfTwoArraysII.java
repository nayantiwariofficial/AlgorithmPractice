import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiConsumer;

public class IntersectionOfTwoArraysII {
    public static int[] intersection(int[] nums1, int[] nums2) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        int[] min = nums1.length > nums2.length ? nums2 : nums1;
        int[] max = nums1.length <= nums2.length ? nums2 : nums1;

        for (int i = 0; i < min.length; i++) {
            if (hashMap.containsKey(min[i]) && !(hashMap.get(min[i]) < 1)) {
                hashMap.put(min[i], hashMap.get(min[i]) + 1);
            } else {
                hashMap.put(min[i], 1);
            }
        }

        for (int i = 0; i < max.length; i++) {
            if (hashMap.containsKey(max[i])) {
                arrayList.add(max[i]);
                hashMap.put(max[i], hashMap.get(max[i]) - 1);
                if (hashMap.containsValue(0)) {
                    hashMap.remove(max[i]);
                }
            }
        }

        int res[] = new int[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++) {
            res[i] = arrayList.get(i);
        }

        return res;
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


/*String min = Arrays.toString(nums1.length > nums2.length ? nums2 : nums1)
                .replace(",", "")
                .replace("[", "")
                .replace("]", "")
                .replace(" ", "");
        String max = Arrays.toString(nums1.length > nums2.length ? nums1 : nums2)
                .replace(",", "")
                .replace("[", "")
                .replace("]", "")
                .replace(" ", "");

        String pre = min;

        for (int i = 0; i < min.length(); i++) {
            if (max.indexOf(pre) != 0) {
                pre = pre.substring(0, pre.length() - 1);
            }
        }

        int[] res = new int[pre.length()];


        for (int i = 0; i < pre.length(); i++) {
            res[i] = Integer.parseInt(pre.charAt(i) + "");
        }
*/