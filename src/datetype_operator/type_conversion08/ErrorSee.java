package datetype_operator.type_conversion08;

/**
 * @Author: huangxinjian
 * @Description: 常见错误
 * @Date: Created in 23:20 2019/1/26
 * @Modified By:
 */
public class ErrorSee {

    /*
    基本数据类型在使用的时候,很容易产生溢出问题,我们需要注意
     */
    public static void main(String[] args) {

        int money = 1000000000; //10亿,在int的范围内
        int years = 20;

        int total1 = money * years;  //这里就会发生溢出,因为 得到的结果已经超出了 int的范围,因此,无法正确计算

        long total2 = money * years; //这里得到的结果也是不正确的,因此在计算的时候,就已经溢出了,最终的结果也是溢出

        long total3 = money * (long)years; //这里就会得到正确的结果,因为其中一个操作数是long,另外一个操作数也会自动转换为long再进行计算

        //因此,我们平时计算大数值时,可以使用以下小技巧

        long t4 = 1L * 123132 * 123 * years; //因为有一个操作数是long.因此可以确保计算的准确

    }
}
