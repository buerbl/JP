package 华为编程pg;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @Author 布尔bl
 * @create 2020/3/14 20:35
 */
public class 字串的连接最长路径查找 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0 ; i < count; i ++){
            String s = scanner.next(); // 不能使用nextInt()
            list.add(s);
        }
        Collections.sort(list);
        list.forEach(System.out::println);

    }
}
