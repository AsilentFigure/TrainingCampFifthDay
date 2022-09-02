package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1200. 最小绝对差
 * @author ASilentFigure
 * @project TrainingCampFifthDay
 * @date 2022/9/2 10:05
 */
public class MinimumAbsDifference {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> resList = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < arr.length; i++){
            min = Math.min(min, arr[i] - arr[i - 1]);
        }
        for(int i = 1; i < arr.length; i++){
            if(min == arr[i] - arr[i - 1]){
                List<Integer> list = new ArrayList<>();
                list.add(arr[i - 1]);
                list.add(arr[i]);
                resList.add(list);
            }
        }
        return resList;
    }
}
