package solution;

import java.util.*;

/**
 * LCS 02. 完成一半题目
 * @author ASilentFigure
 * @project TrainingCampFifthDay
 * @date 2022/9/2 10:59
 */
public class HalfQuestions {

    public int halfQuestions1(int[] questions) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int question : questions){
            if(!map.containsKey(question)){
                list.add(question);
            }
            map.put(question, map.getOrDefault(question, 0) + 1);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o2) - map.get(o1);
            }
        });
        int num = questions.length / 2;
        int result = 0;
        while ( num > 0){
            for(int questionCnt : list){
                num -= map.get(questionCnt);
                result++;
                if(num <= 0){
                    break;
                }
            }
        }
        return result;
    }

    public int halfQuestions(int[] questions) {
        int [] cnt = new int[1001];
        for(int question : questions){
            cnt[question]++;
        }
        Arrays.sort(cnt);
        int result = 0;
        int size = questions.length / 2;
        for(int i = cnt.length - 1; i > 0; i--){
            size -= cnt[i];
            result++;
            if(size <= 0){
                break;
            }
        }
        return result;
    }
}
