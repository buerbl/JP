package 华为编程pg;

import java.util.Scanner;

/**
 * @Description:
 * @Author: boolean
 * @Date: 2020/2/5 14:55
 */
public class StrTotal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String source = scanner.nextLine();
        String target = scanner.nextLine();
        int sum = 0;
        char[] sourceArr = source.toCharArray();
        for (int i = 0; i < sourceArr.length; i ++){
            if (target.equalsIgnoreCase(String.valueOf(sourceArr[i]))){
                sum ++;
            }
        }
        System.out.println(sum);

    }
}



