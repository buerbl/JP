package 华为编程pg;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @Author 布尔bl
 * @create 2020/3/14 18:26
 */
public class 数字颠倒 {
    public static void main(String[] args) {
        int input = new Scanner(System.in).nextInt();
        handle(input);

    }

    private static void handle(int input) {
        char[] toCharArray = Integer.valueOf(input).toString().toCharArray();
        for (int i = toCharArray.length - 1; i>= 0; i--) {
            System.out.print(toCharArray[i]);
        }

    }
}
