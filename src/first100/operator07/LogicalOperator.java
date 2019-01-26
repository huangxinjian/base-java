package first100.operator07;

/**
 * @Author: huangxinjian
 * @Description: 逻辑运算符：操作数和运算结果都是boolean
 * @Date: Created in 23:57 2019/1/25
 * @Modified By:
 */
public class LogicalOperator {

    /*
    逻辑运算符是用来操作我们的布尔值的，它一共有以下几种：
            &  : 逻辑与  两个操作数都是true，结果才为true（检查完全部操作数才返回结果）
            |  : 逻辑或  只要有其中一个操作数为true，结果就为true（检查完全部操作数才返回结果）
            !  : 逻辑非  对逻辑结果取反，!false就是true  ！true就是false
            && : 短路与  只要有一个操作数为false，就立即返回false（只要某一个操作数为false，就立即返回，不再检查剩余操作数）
            || : 短路或  只要有一个操作数为true，就立即返回true（只要某一个操作数为true，就立即返回，不再检查剩余操作数）
            ^  : 异或    相同为fasle，不同为true


      注意：  & | ^ 同时也是 位运算符，可以用来操作数字
     */
    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;

        System.out.println(b1 & b2);  //比较完全部 b1和b2 的值才返回结果：false
        System.out.println(b1 | b2);  //比较完全部 b1和b2 的值才返回结果：true(因为b1是true)
        System.out.println(b2 && b1); //因为b2操作数是 fasle，因此不会再理会 b1 的结果是多少，直接返回 false
        System.out.println(b1 || b2); //因为b1操作数是 true，因此不会再理会 b2 的结果是多少，直接返回 true
        System.out.println(b1 ^ b2);  //b1 b2 不同，返回true
        System.out.println(!b1);  //b1为true，取反则为false

        boolean b3 = 1>2 & 2>(3/0);  //执行这里会报异常，ArithmeticException,因为逻辑与 & 它会计算出全部操作数才返回结果
        //因此 3/0 这里会报异常 java.lang.ArithmeticException: / by zero
        System.out.println(b3);

        boolean b4 = 1>2 && 2>(3/0);  //如果我们使用短路与，则结果会直接返回 fasle，不会报异常
        //因为当我们计算出 1>2 为false的时候，结果就已经出来了

    }
}
