package 华为编程pg;

import java.util.Scanner;

/**
 * @Author 布尔bl
 * @create 2020/3/17 23:45
 */
public class 求int型数据在内存中存储时1的个数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int nextInt = scanner.nextInt();
            int count = 0;
            while (nextInt > 0){
                count+=1;
                nextInt &=(nextInt -1);
            }
            System.out.println(count);
        }
    }
}
