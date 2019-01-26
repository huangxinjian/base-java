package first100.operator07;

/**
 * @Author: huangxinjian
 * @Description: 条件运算符
 * @Date: Created in 17:39 2019/1/26
 * @Modified By:
 */
public class ConditionalOperator {

    /*
    条件运算符  x ? y : z
       x 为 boolean 类型表达式
         其中 x 操作数的结果如果true，则整个条件运算符的结果为 y
         如果 x 操作数的结果如果false，则整个条件运算符的结果为 z
     */
    public static void main(String[] args) {

        int scope = 100;
        int x = -100;

        /*
        如果是复合  三元运算符，从右往左算
           所以先算：  x == 0 ? 0 : -1 结果是 -1
           然后现在的表达式就是  x > 100 ? 1 : -1
           然后结果 x > 100 为 false，所以最终结果为 -1
         */
        int flag = x > 100 ?  1 : ( x == 0) ? 0 : -1;

        String result = scope > 60 ? "及格" : "不及格";

        System.out.println("result:" + result);
        System.out.println("flag:" + flag);

    }
}
