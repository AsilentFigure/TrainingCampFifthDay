package solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1331. 数组序号转换
 * @author ASilentFigure
 * @project TrainingCampFifthDay
 * @date 2022/9/2 15:12
 */
public class ArrayRankTransform {

    public int[] arrayRankTransform(int[] arr) {
        int [] nums = new int[arr.length];
        System.arraycopy(arr, 0, nums, 0 , arr.length);
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            if(!map.containsKey(num)){
                map.put(num, map.size() + 1);
            }
        }
        for(int i = 0; i < arr.length; i++){
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}
