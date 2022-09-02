package solution;

import java.util.Arrays;

/**
 * 1877. 数组中最大数对和的最小值
 * @author ASilentFigure
 * @project TrainingCampFifthDay
 * @date 2022/9/2 9:49
 */
public class MinPairSum {

    public int minPairSum(int[] nums) {
        int result = Integer.MIN_VALUE;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length / 2; i++){
            int num  = nums[i] + nums[nums.length - i - 1];
            result = Math.max(result, num);
        }
        return result;
    }
}
