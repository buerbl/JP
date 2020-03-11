package 华为编程pg;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author 布尔bl
 * @create 2020/3/11 22:10
 */
public class 提取不重复的整数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        handle(input);
    }

    private static void handle(int input) {
        String value = String.valueOf(input);
        ArrayList<Character> characterArrayList = new ArrayList<>();
        for (int i = value.length()-1 ; i >= 0;  i--) {
            char charAt = value.charAt(i);
            if (!characterArrayList.contains(charAt)){
                characterArrayList.add(charAt);
            }
        }
        characterArrayList.forEach(System.out::print);
    }
}
