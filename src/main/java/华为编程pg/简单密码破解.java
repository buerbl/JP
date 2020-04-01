package 华为编程pg;

import java.util.Scanner;

/**
 * @Author 布尔bl
 * @create 2020/4/1 9:28
 */
public class 简单密码破解 {
    private final static String a = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final static String b = "123456789022233344455566677778889999bcdefghijklmnopqrstuvwxyza";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) == input.charAt(i)) {
                    stringBuilder.append(b.charAt(j));
                    break;
                }
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
