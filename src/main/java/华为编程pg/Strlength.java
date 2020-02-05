package 华为编程pg;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description:
 * @Author: boolean
 * @Date: 2020/2/5 14:06
 */
public class Strlength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        int length = strlength(nextLine);
        System.out.println(length);
    }

    private static int strlength(String target) {
        String[] split = target.split(" ");
//        System.out.println(Arrays.toString(split));
        return split[split.length - 1].length();
    }
}



