package org.PairIdices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindPairIndices {

    static void solution(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        List<int[]> pairs = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int competent = target - nums[i];
            if (map.containsKey(competent)) {
                pairs.add(new int[]{map.get(competent), i});
            }
            map.put(nums[i], i);
        }

        for (int[] pair : pairs) {
            System.out.println("Pair 1 : " + pair[0] + " and " + pair[1]);
        }
    }

    public static void main(String[] args) {
        System.out.println("Find the indices of the given target number from the int array");

        int[] nums = {2, 7, 8, 0, 9, 11};
        int target = 11;

        solution(nums, target);
    }
}
