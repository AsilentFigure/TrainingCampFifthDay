package solution;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 1637. 两点之间不包含任何点的最宽垂直面积
 * @author ASilentFigure
 * @project TrainingCampFifthDay
 * @date 2022/9/2 15:21
 */
public class MaxWidthOfVerticalArea {

    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int maxWidth = Integer.MIN_VALUE;
        for(int i = 1; i < points.length; i++){
            maxWidth = Math.max(maxWidth, points[i][0] - points[i - 1][0]);
        }
        return maxWidth;
    }
}
