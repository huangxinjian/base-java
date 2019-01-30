package object_oriented;

/**
 * @Author: huangxinjian
 * @Description:  用一个类来分析 创建对象时执行了什么操作
 * @Date: Created in 16:04 2019/1/29
 * @Modified By:
 */
public class StxStu {

    //属性（成员变量）
    int id;
    String sname;
    int age;
    //方法
    void study(){
        System.out.println("我正在学习！");
    }
    //构造方法
    StxStu(){

    }

    //这就是一个主线程
    public static void main(String[] args) {

        // s 会存放在 栈中，new StxStu会在堆中开辟内存，然后s指向内存中该对象的地址
        StxStu s = new StxStu();

        /*
        1. 一开始，JVM给我们的main线程分配一块栈帧
        2. 加载 StxStu的类信息的到方法区中，里面存放着我们的成员变量 id、name、age以及study方法
         */

    }

}
