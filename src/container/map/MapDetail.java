package container.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: huangxinjian
 * @Description:    Map详解
 * @Date: Created in 11:44 2019/2/19
 * @Modified By:
 */
public class MapDetail {

    /*
        Map 是用来存储  键（key）-值（value）对 的。通过“键”来标识对象，因此“键”不能重复

        格式：
            Map<键的类型，值的类型> map ;


        Map 实现的接口有:  HashMap 、 TreeMap  、  HashTable 、Properties

        常用的方法有：

                Object put(Object key,Object value)       存放键值对
                Object get(Object key)                    通过键对象查找得到值对象
                Object remove(Object key)                 删除键对象对应的值对象
                boolean containsKey(Object key)           Map容器中是否有包含键对象对应的键值对
                boolean containsValue(Object value)       Map容器中是否有包含值对象对应的键值对
                int size()                                包含键值对的数量
                boolean isEmpty()                         Map是否为空
                void putAll(Map t)                        将t的所有键值对存放到本Map对象
                void clear()                              清除本Map对象所有键值对



     */
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"aa");
        map.put(2,"bb");
        map.put(3,"cc");
        map.put(4,"ddd");

        System.out.println(map);
        map.remove(4);
        System.out.println(map);

        System.out.println(map.get(2));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("ddd"));

        Map<Integer,String> maps2 = new HashMap<>();
        maps2.put(4,"ee");
        maps2.put(5,"ff");

        map.putAll(maps2);  //要put的map的类型必须跟原map一样
        System.out.println(map);

        // map中的键对象是不能重复的，如果重复了，新的会覆盖旧的
        map.put(2,"黄欣健");
        System.out.println(map);
    }


}
