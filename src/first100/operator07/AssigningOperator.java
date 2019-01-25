package first100.operator07;

/**
 * @Author: huangxinjian
 * @Description: 赋值运算符以及赋值扩展运算符
 * @Date: Created in 23:39 2019/1/25
 * @Modified By:
 */
public class AssigningOperator {


    public static void main(String[] args) {
        /*
        赋值运算符为 ：  =
         */
        int a1 = 3; //把整形常量 3 赋值给 int 类型的变量 a1

        /*
        扩展运算符有： +=、-=、*=、/=、%=
         */

        int a=3;
        int b=4;
        a+=b;//相当于a=a+b;
        System.out.println("a="+a+"\nb="+b);
        a=3;
        a*=b+3;//相当于a=a*(b+3)
        System.out.println("a="+a+"\nb="+b);
    }
}
