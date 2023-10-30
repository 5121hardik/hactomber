import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] ip = {3,3};
        int[] array = twoSum(ip, 6);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        HashMap<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++){
            numsMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numsMap.containsKey(complement) && numsMap.get(complement) != i) {
                indices[0]=i;
                indices[1]=numsMap.get(complement);
            }
        }
        // for (int j: numsMap.keySet()){
        //     if (numsMap.containsKey(target - j) && numsMap.get(target - j)!=numsMap.get(j)){
        //         indices[0] = numsMap.get(j);
        //         indices[1] = numsMap.get((target - j));
        //     }
        // }

        return indices;
    }
}
