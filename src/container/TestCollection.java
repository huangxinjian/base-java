package container;

/**
 * @Author: huangxinjian
 * @Description:   介绍 Collection 接口
 * @Date: Created in 11:16 2019/2/16
 * @Modified By:
 */
public class TestCollection {


    /*
    Collection接口是 所有容器类的根类，与 Map 同级

            Collection 表示一组对象，它是收集、集中的意思。它有两个子接口： Set List

            常用方法：

            boolean  add(T element);                         添加元素到容器中
            boolean  remove(Object element);                 从容器中移除该元素,只是移除了引用的值（即地址值），并没有删除移除的对象，删除还是交给gc来处理
            boolean  contains(Object element)                容器中是否包含该元素
            int      size()                                  容器中元素的数量
            boolean  isEmpty()                               容器是否为空
            void     clear()                                 清空容器中的所有元素
            Iterator iterator()                              获得迭代器，用于遍历所有元素
            boolean  containsAll(Collection c)               本容器是否包含c容器中的所有元素
            boolean  addAll(Collection c)                    将容器c中的所有元素添加到本容器中
            boolean  removeAll(Collection c)                 移除本容器和容器c中共同包含的元素
            boolean  retainAll(Collection c)                 保留本容器和容器c中共同包含的元素，移除非交集的元素
            Object[] toArray()                               转化成Object数组
     */

    public static void main(String[] args) {


    }
}
