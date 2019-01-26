package first100.operator07;

/**
 * @Author: huangxinjian
 * @Description: 位运算符
 * @Date: Created in 11:21 2019/1/26
 * @Modified By:
 */
public class AnOperator {

    /*
    位运算符指的是进行 二进制的运算，常用的有以下几种：

            ~     取反
            &     按位与
            |     按位或
            ^     按位异或
            <<    左移运算符   左移一位等于 乘2
            >>    右移运算符   右移一位等于 除2取商
     */
    public static void main(String[] args) {

        int a = 3;
        int b = 4;

        /*
        因为位运算符指的是进行二进制的运算，因此我们要先将 3和4化成二进制
                    十进制      操作       二进制
                      3                     0011
                      4                     0100
                      0          &          0000    只有都为1，结果才为1
                      7          |          0111    只要有一个1，结果就为1
                      7          ^          0111    相同为0.不同为1
         */
        //按位与
        System.out.println( a & b);  //输出0
        //按位或
        System.out.println( a | b);  //输出7
        //按位异或
        System.out.println( a ^ b);  //输出7

        /*
        移位运算        >>  右移运算符
                        <<  左移运算符
         */

        int c = 3 << 2;  //结果为12，因为左移一位等于乘2
        int d = 3 * 2 * 2;  //d 和 c 的结果是一样的
        System.out.println( c == d);
        System.out.println(12 >> 2); //相当于 12 / 2 / 2 = 3

    }
}
