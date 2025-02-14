package org.PairOfNumbers;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int[] solution(int[] numbs, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for(int num: numbs) {
            int temp = target - num;
            if (map.containsKey(temp)){
                System.out.println("Pair Found");
                return new int[]{temp, num};
            }
            map.put(num,1);
            System.out.println(map);
        }
        System.out.println("No Pair Found");
        return new int[]{0, 0};
    };

    public static void main(String[] args) {
        System.out.println("Find the pair of numbers");

        int[] nums = {1,7,3,1,11,9,0};
        int target = 9;

        int[] result = solution(nums, target);

        for(int i: result)
            System.out.println(i);
        }
}