package 华为编程pg;

import java.util.Scanner;

/**
 * @Description:
 * @Author: boolean
 * @Date: 2020/2/24 20:09
 */
public class 取近似值 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double v = scanner.nextDouble();
        v += 0.5;
        System.out.println((int)v);
    }
}



