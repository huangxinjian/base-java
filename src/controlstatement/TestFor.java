package controlstatement;

/**
 * @Author: huangxinjian
 * @Description: 测试for循环
 * @Date: Created in 11:29 2019/1/27
 * @Modified By:
 */
public class TestFor {

    /*
    for(初始化语句；判断条件语句；控制条件语句){

    }

    注意： 判断条件语句的结果需要是一个 boolean 值
     */
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i < 101; i++){
            sum += i;
        }
        System.out.println(sum);

        //省略某个条件
        int j = 0;
        for (; j<10;j++){

        }

        //无限循环
        for (;;){
            System.out.println("你好");
        }

        /*
        unreachable statement 异常：表明该语句前可能已经return或存在死循环
         */

    }
}
