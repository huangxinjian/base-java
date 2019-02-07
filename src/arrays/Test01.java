package arrays;

/**
 * @Author: huangxinjian
 * @Description:  声明数组
 * @Date: Created in 11:31 2019/2/7
 * @Modified By:
 */
public class Test01 {

    /*
    数组其实也是对象，数组中的值可以看作是该对象的成员变量，数组的值都存储在 堆 中
        因此，数组的初始化也会遵循成员变量的初始化，int数组就默认初始 0 ，布尔类型默认初始化false，引用类型默认初始化 null
     */
    public static void main(String[] args) {
       int[] a = new int[3];  //声明一个 int数组类型的变量a
       int b[] = new int[3];  //声明一个 int类型的数组变量b
    }
}
