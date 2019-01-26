package datetype_operator.scaneer;

import java.util.Scanner;

/**
 * @Author: huangxinjian
 * @Description: Scanner 获取键盘输入
 * @Date: Created in 23:32 2019/1/26
 * @Modified By:
 */
public class TestScaneer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // System.in 是IO流中的内容
        System.out.println("请输入名称:");
        String name = scanner.nextLine();
        System.out.println("请输入年龄");
        int age = scanner.nextInt();

        System.out.println("###############");
        System.out.println(name);
        System.out.println(age);
    }
}
