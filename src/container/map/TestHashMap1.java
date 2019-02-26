package container.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: huangxinjian
 * @Description:
 * @Date: Created in 17:19 2019/2/19
 * @Modified By:
 */
public class TestHashMap1 {
    /*
            HashMap 采用哈希算法 实现，是Map接口最常用的实现类。

            底层采用的是 哈希表 存储数据，因为要求 键对象 不能重复，如果发生重复，新的键值对会替换旧的键值对

            HashMap在 查找、删除、修改方面都有非常高的效率
     */

    public static void main(String[] args) {
        Map<Integer, String> m1 = new HashMap<Integer, String>();
        Map<Integer, String> m2 = new HashMap<Integer, String>();
        m1.put(1, "one");
        m1.put(2, "two");
        m1.put(3, "three");

        m1.put(null,"aa");  //key为null
        System.out.println(m1.get(null));


        m2.put(1, "一");
        m2.put(2, "二");
        System.out.println(m1.size());
        System.out.println(m1.containsKey(1));
        System.out.println(m2.containsValue("two"));
        m1.put(3, "third"); //键重复了，则会替换旧的键值对
        Map<Integer, String> m3 = new HashMap<Integer, String>();
        m3.putAll(m1);
        m3.putAll(m2);
        System.out.println("m1:" + m1);
        System.out.println("m2:" + m2);
        System.out.println("m3:" + m3);
    }

    /*
            HashTable 与 HashMap的使用方法几乎一样，底层实现也几乎一样，
            只不过HashTable类似于Vector，在方法中添加了 synchronized 关键字，确保  线程同步检查， 因此效率很低

            HashMap和HashTable的区别：
                1. HashMap 线程不安全，效率高，允许 key 或 value 为null
                2. HashTable 线程安全，效率低，不允许 key或value 为null
                    if (value == null) {   底层源码
                        throw new NullPointerException();
                    }
     */
}
