package 华为编程pg;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * @Author 布尔bl
 * @create 2020/4/7 18:50
 */
public class 删除字符串中出现次数最少的字符 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            char[] chars = input.toCharArray();
            LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<>();
            for (char c : chars) {
                if (!linkedHashMap.containsKey(c)) {
                    linkedHashMap.put(c, 1);
                } else {
                    linkedHashMap.put(c, linkedHashMap.get(c) + 1);
                }
            }
            Collection<Integer> values = linkedHashMap.values();
            Integer min = Collections.min(values);
            StringBuffer stringBuffer = new StringBuffer();
            for (char c : chars) {
                if (linkedHashMap.get(c) != min) {
                    stringBuffer.append(c);
                }
            }

            System.out.println(stringBuffer.toString());
        }
    }
}
