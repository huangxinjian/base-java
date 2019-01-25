package first100.operator07;

/**
 * @Author: huangxinjian
 * @Description: 算术运算符
 * @Date: Created in 22:31 2019/1/25
 * @Modified By:
 */
public class ArithmeticOperator {


    public static void main(String[] args) {
        /*
        算术运算符中  + - * / % 属于二元运算符，即需要两个操作数才可以完成运算
        其中 % 是取模运算符，也就是求余数
         */

        /*
        整数运算：
            1. 如果两个操作数中有一个为long，则结果也为long
            2. 没有long时，结果都为int。即便操作数全部是 short 或 byte，结果也为int类型
        浮点运算：
            1. 只有两个操作数都是 float 时，结果才是 float，其余都是double类型
         */

        byte a = 1;
        int b = 2;
        long b2 = 3;
        // byte c = a + b; 这里会编译报错，因为 b是int类型，a+b的结果也是 int类型，无法赋值给 byte 类型的变量c
        // int c = b + b2; 这里编译也报错，因为 b2 是 long 类型，所以结果为 long 类型，无法赋值给 int 类型的变量c

        float f1 = 3.14F;
        double f2 = b+b2; //这里编译不报错的原因是，double的最大范围比 b+b2 要大，因为结果会自动转换给 double 类型
        // 同理  float f2  = b + b2 ; 也不会报错

        // float f3 = f1 + 6.2;  编译报错，因为 6.2为double类型， 所以结果为double类型，因此无法赋值

        /*
        取模运算：
            其操作数可以为浮点数,一般使用整数，结果是“余数”，
            “余数”符号和左边操作数相同，如：
                    7 % 3 = 1，
                    -7 % 3 = -1，
                    7 % -3 = 1。
         */

        /*
          算数运算符中还有另外一种运算符叫 一元运算符： ++ -- ，它只需要一个操作数即可
          如果是 ++a 则先增后操作  如果是 a++，则先操作后自增
         */

        int a1 = 3;
        int b1 = a1++;   //执行完后,b1=3。先给b1赋值，再自增。
        System.out.println("a1="+a1+"\nb1="+b1);
        a1 = 3;
        b1 = ++a1;   //执行完后,b1=4。a1先自增，再给b1赋值
        System.out.println("a1="+a1+"\nb1="+b1);
    }
}
