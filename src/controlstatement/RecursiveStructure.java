package controlstatement;

/**
 * @Author: huangxinjian
 * @Description: 递归结构
 * @Date: Created in 16:20 2019/1/27
 * @Modified By:
 */
public class RecursiveStructure {

    /*
    递归结构需要确定两个条件：
            1. 递归头，也就是递归的结束条件，不然将进去死循环
            2. 递归体，即什么时候调用自身方法
     */
    public static void main(String[] args) {
        long d1 = System.currentTimeMillis();
        int result1 =calculatingFactorial(10);
        long d2 = System.currentTimeMillis();
        System.out.println(result1);
        System.out.println("总耗时："+(d2-d1));

        System.out.println(function2(7));
    }

    // 案例1： 计算 n!
    public static int calculatingFactorial(int n){
        if (n == 1){
            return 1;
        }
        return n * calculatingFactorial(n-1);
    }

    //斐波那契数列 1 1 2 3 5 8 13 21 ..
    public static int function2(int length){
        if (length == 0 || length == 1){
            return 1;
        }
        return function2(length-2) + function2(length-1);
}
}
