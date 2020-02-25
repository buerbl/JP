package 华为编程pg;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @Description:
 * @Author: boolean
 * @Date: 2020/2/24 20:21
 */
public class 合并表记录 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            Map<Integer, Integer> map = new TreeMap();
            for (int i = 0; i < n; i ++){
                int key = scanner.nextInt();
                int value = scanner.nextInt();
                if (map.containsKey(key)){
                    Integer integer = map.get(key);
                    map.put(key, integer + value);
                }else {
                    map.put(key, value);
                }
            }
            for (Map.Entry<Integer,Integer> index : map.entrySet()){
                System.out.print(index.getKey()+" "+index.getValue()+" ");
            }
        }
    }
}



