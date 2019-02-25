package datetype_operator.operator07;

/**
 * @Author: huangxinjian
 * @Description: 关系运算符
 * @Date: Created in 23:43 2019/1/25
 * @Modified By:
 */
public class RelationalOperator {

    public static void main(String[] args) {
        /*
        关系运算符一共有以下几种：
                ==  等于（用于引用类型时，比较的是 地址和值,基本数据类型则比较的是 值）
                >=  大于并且等于
                <=  小于并且等于
                >   大于但不等于
                <   小于但不等于
                !=  不等于

           ！！！关系运算的结果只有两个值： true 或者 false
         */


        int a = 3;
        int b1 = 3;
        System.out.println(a==b1);
        System.out.println(a>=3);
        System.out.println(a<=3);
        System.out.println(a!=3);
        System.out.println(a>3);
        System.out.println(a<3);


        char b = 'a';
        char c = 'c';
        System.out.println(b+0);
        System.out.println((int)c);
        System.out.println(b>=c); //char类型在比较的时候会被转化为 数值型int

        /*
        注意事项:
            1. = 是赋值运算符，而 == 是关系运算符
            2. ==、!= 是所有（基本类型和引用类型）数据类型都可以使用
            3. >=、<=、>、< 仅针对 基本数据类型中的数值类型（short byte int long float double ）以及 char 类型，boolean类型不能使用
            4. == 比较的是栈中的值
         */
    }
}
