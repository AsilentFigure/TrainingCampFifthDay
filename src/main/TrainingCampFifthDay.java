package main;

import solution.*;

import java.util.Arrays;

/**
 * @author ASilentFigure
 * @project TrainingCampFifthDay
 * @date 2022/9/2 9:43
 */
public class TrainingCampFifthDay {

    public static void main(String[] args) {
        int [] nums = {40, 10, 20, 30, 20};
        ArrayRankTransform arrayRankTransform = new ArrayRankTransform();
        System.out.println(Arrays.toString(arrayRankTransform.arrayRankTransform(nums)));
    }
}
