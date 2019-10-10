import java.util.*;

/**
 * @author yolo
 * @date 2019/10/10-23:22
 * 给一非空的单词列表，返回前 k 个出现次数最多的单词。
 *
 * 返回的答案应该按单词出现频率由高到低排序。如果不同的单词有相同出现频率，按字母顺序排序。
 *
 * 示例 ：
 *
 * 输入: ["the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"], k = 4
 * 输出: ["the", "is", "sunny", "day"]
 * 解析: "the", "is", "sunny" 和 "day" 是出现次数最多的四个单词，
 *     出现次数依次为 4, 3, 2 和 1 次。
 *  
 * 注意：
 *
 * 假定 k 总为有效值， 1 ≤ k ≤ 集合元素数。
 * 输入的单词均由小写字母组成。
 *
 */

public class TopK {
    public static Map<String, Integer> calcCount(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for (String w : words) {
            int count = map.getOrDefault(w, 0);
            map.put(w, count + 1);
        }

        return map;
    }

    public static Map<Integer, List<String>> calcCountOfWords(Map<String, Integer> map) {
        Map<Integer, List<String>> ret = new HashMap<>();
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            String word = e.getKey();
            int count = e.getValue();

            if (!ret.containsKey(count)) {
                ret.put(count, new ArrayList<>());
            }
            ret.get(count).add(word);
        }

        return ret;
    }

    private static class IntegerComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    }

    public static void main(String[] args) {
        String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        int k = 4;
        Map<String, Integer> wordCount = calcCount(words);
        System.out.println(wordCount);
        Map<Integer, List<String>> countToWordList = calcCountOfWords(wordCount);
        System.out.println(countToWordList);

        Set<Integer> counts = countToWordList.keySet();
        System.out.println(counts);
        List<Integer> countsList = new ArrayList<>(counts);
        Collections.sort(countsList, new IntegerComparator());
        /*
        Collections.sort(countsList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
         */
        //Collections.sort(countsList, (o1, o2) -> o2 - o1);
        System.out.println(countsList);

        List<String> result = new ArrayList<>();
        int n = 0;
        int i = 0;
        while (n < k) {
            int count = countsList.get(i);
            i++;
            List<String> ws = countToWordList.get(count);
            Collections.sort(ws);
            if (ws.size() <= k - n) {
                // 如果候选人数量小于需要人数，全部录取
                result.addAll(ws);
                n += ws.size();
            } else {
                // 否则，只录取需要的人数
                result.addAll(ws.subList(0, k - n));
                n += (k - n);
            }
        }
        System.out.println(result);
    }
}








