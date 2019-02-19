package container;

import java.util.List;
import java.util.Vector;

/**
 * @Author: huangxinjian
 * @Description:  Vector 详解
 * @Date: Created in 11:33 2019/2/19
 * @Modified By:
 */
public class VectorDetail {

    /*

            Vector 是线程安全的 容器，底层也是采用 了 数组 来实现的，与 ArrayList差不多，但是效率低

            大部分方法都使用了  synchronized 关键字来标识

            建议：

                1. 需要线程安全的时候，使用 Vector
                2. 不存在线程安全问题时，并且查找较多用ArrayList
                3. 不存在线程安全问题时，增加或删除元素较多用LinkedList
     */

    public static void main(String[] args) {

        List<String> list = new Vector<>();

        list.add("aa");
        list.add("bb");

        System.out.println(list);
    }
}
