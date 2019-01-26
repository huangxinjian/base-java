package first100.operator07;

/**
 * @Author: huangxinjian
 * @Description: 字符串连接符
 * @Date: Created in 11:38 2019/1/26
 * @Modified By:
 */
public class StringConcatenator {

    /*
    字符串连接符就是 ；  +
    只要两边的操作数，有一个是字符串，结果就为 字符串
     */
    public static void main(String[] args) {

        int a = 3;
        System.out.println("你好" + 3);

        String b = "4";
        int c = 5;

        System.out.println(b + c ); //输出45
        System.out.println(a+c+b);  //输出84
        /*
        因为 + 运算符的优先级是 从左到右，因此会先算 a+c =8，然后再与字符串 b 相连接，所以输出 84
         */
        System.out.println(a+b+c); //输出 345

        /*
        但是 如果我们使用 char 来进行运算，则会换成十进制
         */
        char d = '4';
        int e = 5;
        System.out.println(d + e); // d 转化成十进制是 52

    }
}
