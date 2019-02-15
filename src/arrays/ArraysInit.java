package arrays;

/**
 * @Author: huangxinjian
 * @Description:  声明数组
 * @Date: Created in 11:31 2019/2/7
 * @Modified By:
 */
public class ArraysInit {

    /*
    数组其实也是对象，数组中的值可以看作是该对象的成员变量，数组的值都存储在 堆 中
        因此，数组的初始化也会遵循成员变量的初始化，int数组就默认初始 0 ，布尔类型默认初始化false，引用类型默认初始化 null
     */
    public static void main(String[] args) {
       int[] a = new int[3];  //声明一个 int数组类型的变量a
       int b[] = new int[3];  //声明一个 int类型的数组变量b

       //int [] c = new int[3]{1,2,3};  //这样是错误的，不能动态 静态初始化同时进行
       int[] c = {1,2,3};  //静态初始化
       int[] d= new int[3];  //默认初始化

        int[] a1 = new int[2];//动态初始化数组，先分配空间；
        a1[0]=1;//给数组元素赋值；
        a1[1]=2;//给数组元素赋值；
    }
}
