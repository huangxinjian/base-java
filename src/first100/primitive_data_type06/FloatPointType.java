package first100.primitive_data_type06;

import java.math.BigDecimal;

/**
 * @Author: huangxinjian
 * @Description:  浮点型变量/常量
 * @Date: Created in 21:35 2019/1/25
 * @Modified By:
 */
public class FloatPointType {

    /*
    浮点型(不是精确的)一共有两大类：

            float：又称为单精度类型，尾数可以精确到7位数字，占有4个字节
            double：又称为双精度类型，数值精度约为float的两倍，占用8个字节
          因此浮点型的默认类型就是 double
     */

    /*
    浮点型常量有两种表现形式:

        十进制数形式:     3.14   314.0  0.314
        科学记数法形式：  314e2  314E2   314E-2
     */

    public static void main(String[] args) {
        //定义float变量
//    float a = 3.14;  //报错的原因是 浮点默认是double,占用8个字节，但是float只占有4个字节，因此无法存放
        float a = 3.14F;  // 使用大写字符 F，就能表示为 这个浮点型常量为float类型

        //使用科学记数法给浮点型变量赋值
        double b = 314e2;  // 等于 314*100 = 31400
        double b2 = 314e-2; //等于 314/100 = 3.14


    /*
    注意：浮点类型它是不精确的，因此我们不能使用浮点类型来进行比较，特别是金融领域
    因此，如果我们要进行不产生舍入误差的精确数字计算，我们需要使用 BigDecimal 类。
     */
        float  f = 0.1f;
        double d = 1.0/10;
        System.out.println(f == d); //结果为false

        float d1 = 423432423f;
        float d2 = d1+1;  //这里 d2+1后，也是输入 d2等于d1，因此十分不精确
        if(d1==d2){
            System.out.println("d1==d2");//输出结果为d1==d2
        }else{
            System.out.println("d1!=d2");
        }

    /*
    如果要比较，我们需要使用
        java.math包下面的两个有用的类：BigInteger、BigDecimal，这两个类可以处理任意长度的数值。
            BigInteger实现了任意精度的整数运算。
            BigDecimal实现了任意精度的浮点运算。
     */

        BigDecimal bd = BigDecimal.valueOf(1.0);
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));  //substract 是减法 的意思
        System.out.println(bd);  //输出0.5
        //但是如果我们用浮点型直接做减法的话
        System.out.println(1.0-0.1-0.1-0.1-0.1-0.1);  //输出 0.5000000000000001 不精确

        BigDecimal bd2 = BigDecimal.valueOf(0.1);
        BigDecimal bd3 = BigDecimal.valueOf(1.0/10.0);
        System.out.println(bd2.equals(bd3)); //只比较值
        System.out.println(bd2 == bd3); //比较值和地址
    }



}
