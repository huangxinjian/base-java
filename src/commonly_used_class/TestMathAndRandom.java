package commonly_used_class;

import java.util.Random;

/**
 * @Author: huangxinjian
 * @Description:
 * @Date: Created in 16:17 2019/2/13
 * @Modified By:
 */
public class TestMathAndRandom {

    public static void main(String[] args) {

        //取整相关操作
        System.out.println(Math.ceil(3.2));
        System.out.println(Math.floor(3.2));
        System.out.println(Math.round(3.2));
        System.out.println(Math.round(3.8));
        //绝对值、开方、a的b次幂等操作
        System.out.println(Math.abs(-45));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.pow(5, 2));
        System.out.println(Math.pow(2, 5));
        //Math类中常用的常量
        System.out.println(Math.PI);
        System.out.println(Math.E);
        //随机数
        System.out.println(Math.random());// [0,1)


        Random rand = new Random();
        //随机生成[0,1)之间的double类型的数据
        System.out.println(rand.nextDouble());
        //随机生成int类型允许范围之内的整型数据
        System.out.println(rand.nextInt());
        //随机生成[0,1)之间的float类型的数据
        System.out.println(rand.nextFloat());
        //随机生成false或者true
        System.out.println(rand.nextBoolean());
        //随机生成[0,10)之间的int类型的数据
        System.out.print(rand.nextInt(10));
        //随机生成[20,30)之间的int类型的数据
        System.out.print(20 + rand.nextInt(10));
        //随机生成[20,30)之间的int类型的数据（此种方法计算较为复杂）
        System.out.print(20 + (int) (rand.nextDouble() * 10));
    }
}
