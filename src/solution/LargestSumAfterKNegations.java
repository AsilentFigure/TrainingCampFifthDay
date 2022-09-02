package solution;

import java.util.Arrays;

/**
 * 1005. K 次取反后最大化的数组和
 * @author ASilentFigure
 * @project TrainingCampFifthDay
 * @date 2022/9/2 10:16
 */
public class LargestSumAfterKNegations {

    public int largestSumAfterKNegations1(int[] nums, int k) {
        Arrays.sort(nums);
        while (k > 0){
            nums[0] = -nums[0];
            k--;
        }
        int result = 0;
        for(int num : nums){
            result += num;
        }
        return result;
    }

    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int result = 0;
        int minPositive = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(k > 0 && nums[i] < 0){
                nums[i] = -nums[i];
                k--;
            }
            if(nums[i] > 0){
                minPositive = Math.min(nums[i], minPositive);
            }
            result += nums[i];
        }
        if(k > 0){
            if((k & 1) == 0){
                return result;
            }else {
                return result - 2 * minPositive;
            }
        }
        return result;
    }
}
