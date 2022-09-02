package solution;

import java.util.HashSet;
import java.util.Set;

/**
 * 645. 错误的集合
 * @author ASilentFigure
 * @project TrainingCampFifthDay
 * @date 2022/9/2 14:37
 */
public class FindErrorNums {

    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sumNums = 0;
        int sumSet = 0;
        for(int num : nums){
            if(!set.contains(num)){
                set.add(num);
                sumSet += num;
            }
            sumNums += num;
        }
        int [] result = new int[2];
        result[0] = sumNums - sumSet;
        result[1] = (1 + nums.length) * nums.length / 2 - sumSet;
        return result;
    }
}
