package controlstatement;

/**
 * @Author: huangxinjian
 * @Description: while循环
 * @Date: Created in 11:11 2019/1/27
 * @Modified By:
 */
public class TestWhile {

    /*
    while循环 是用来重复执行某个行为的
     */
    public static void main(String[] args) {

        int i = 1;
        int sum = 0;
        while ( i < 101){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
