package 华为编程pg;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description:
 * @Author: boolean
 * @Date: 2020/2/24 12:06
 */
public class 字符串分隔 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            doIt(str);
        }
    }

    private static void doIt(String str) {
        while (str.length() > 8){
            System.out.println(str.substring(0,8));
            str = str.substring(8);
        }
        if (str.length() <= 8){
            String rs = str + "00000000";
            System.out.println(rs.substring(0,8));
        }
    }

}



