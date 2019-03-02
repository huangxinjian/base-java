package container;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: huangxinjian
 * @Description:  工具类 Collections  java.util.Collections 提供了对Set、List、Map进行排序、填充、查找元素的辅助方法。
 * @Date: Created in 10:08 2019/2/28
 * @Modified By:
 */
public class TestCollections {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("huang:"+i);
        }

        System.out.println(list);

        //Collections第一个方法： void shuffle(List) 摇骰子，对List容器内的元素进行随机排列。
        Collections.shuffle(list);
        System.out.println(list);

        //Collections第二个方法： void reverse(List) 对List容器内的元素进行逆续排列 。
        Collections.reverse(list);
        System.out.println(list);

        //Collections第三个方法： void sort(List) 对List容器内的元素排序，排序的规则是按照升序进行排序。
        //如果要遍历自定义的类，需要该类实现 Comparable 接口
        Collections.sort(list);
        System.out.println(list);

        list.add("huang:1");
        list.add(3,"hhh");
        Collections.sort(list);
        System.out.println(list);


        //int binarySearch(List, Object)//对于顺序的List容器，采用折半查找的方法查找特定对象。

        System.out.println(Collections.binarySearch(list,"huang:1"));

        //void fill(List, Object) //用一个特定的对象重写整个List容器。可以用于初始化
        Collections.fill(list,"www");
        System.out.println(list);


    }
}
