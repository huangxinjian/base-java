package first100.variable04;

/**
 * @Author: huangxinjian
 * @Description:  Java中的变量
 * @Date: Created in 20:38 2019/1/25
 * @Modified By:
 */
public class TestVariable {

    /*
     *  java中的变量的本质上就是代表一个”可操作的存储空间"
     *      就像是一个停车位，停车位就代表一个 存储空间，里面存放什么样的车辆都是不确定的，
     *      而且车位的大小也会不一样，不同的车停放的位置就是停车位的大小，也代表了存储空间的大小
     *
     *  我们可通过变量名来访问“对应的存储空间”，从而操纵这个“存储空间”存储的值。
     *
     *  因此变量代表的只是 存储空间的地址，并不是存储空间里面的那个值。
     *
     *  而且 变量需要声明，并且初始化后才能使用。
     *
     */
    public static void main(String[] args) {

        int age;
        age = 18;

        double salary = 3000;

    }
}
