package datetype_operator.primitive_data_type06;

/**
 * @Author: huangxinjian
 * @Description:  整形变量/常量
 * @Date: Created in 21:14 2019/1/25
 * @Modified By:
 */
public class IntVariableOrConstant {

    /*
    整形就是整数类型，分别是
            byte（ 1个字节，8个bit，范围是 -128~+127）
            short  2个字节，范围大概是 +- 3万
            int    4个字节，大约21亿
            long   8个字节，范围 -2的63次方 到 2的63次方-1
    整形用于表示没有小数部分的数值
     */

    /*
    注意，在java中，整型常量还有4种表示形式：
            十进制  如 99，-44
            八进制   要求以 0 开头，如 095， 044
            二进制  要求 0b 或 0B开头，如 0b15
            十六进制 要求 0X 或 0x 开头，例如 0X15
     */

    public static void main(String[] args) {

        int a = 15;  //这是 十进制
        int b = 015; //注意：这是八进制，因为以0开头
        int c = 0x15;  //这是十六进制
        int d = 0b1101;  //这里是二进制
        System.out.println(b); //这里输出的是13，13对应的是十进制，因此八进制的015等于十进制的13，逢8进1，8+5=13
        System.out.println(c); //这里输出的是21，16+5=21
        System.out.println(d); //输出 13

        /*
        变量的值不能超出类型所能代表的范围
         */

//        byte b = 300;  byte的最大范围是 127，因此不能赋值300
        byte age = 30;
        short salary = 30000;
        int population = 2000000000; //注意，整形常量默认都是 int 类型
        /*
        这里报错的原因就是因为 整形常量默认都是 int 类型，
        因此 74000000000 已经超出了 int 的最大范围
        所以如果我们要表达 long 型，则需要在 整型常量后面添加 大写字母 L
         */
        long globalPopulation = 74000000000L;
    }
}
