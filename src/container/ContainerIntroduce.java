package container;

/**
 * @Author: huangxinjian
 * @Description:  容器的介绍
 * @Date: Created in 20:16 2019/2/15
 * @Modified By:
 */
public class ContainerIntroduce {

    /*
        什么是容器？
            容器就是一个用来装对象的对象，


         就像数组，数组本身也是一种容器，可以在里面存放一些基本数据类型和引用类型
            数组的优势:  1. 数组是一种简单的线性序列，可以快速访问数组元素，效率高

            数组的缺点： 2. 不灵活，我们在使用数组的时候，一开始就要指定数组的大小，例如 int[] a= new int[3];
                            不能随着数据的变大而扩容
     */


    /*
    在 Java 中，容器分为下面两大分类：

                           <<interface>>                       <<interface>>
                            Collection                              Map
                         /               \                          /  \
                 <<interface>>      <<interface>>            TreeMap    HashMap
                      Set                List
                     /   \                /    \
              TreeSet     HashSet   ArrayList  LinkedList


            其中 set 集合 和 List 集合的区别就在于：
                1. Set 集合是无序的，且不可存在重复数据
                2. List 集合是有序的，且可以存在重复数据
     */
}
