package container.set;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: huangxinjian
 * @Description:  测试HashSet
 * @Date: Created in 11:57 2019/2/25
 * @Modified By:
 */
public class TestHashSet {

    /*
      private transient HashMap<E,Object> map;  //hashset 核心。单泛型，值采用 object 类型，因此我们传入的值就是key

      而另外的object对象则传入 虚拟值，以与备份映射中的对象关联

      因此 hashSet 之所以不能重复，则是因为 hashMap中key是不可以重复的

      所以，HashSet的查询效率和增删效率都很高


      我们发现里面有个map属性，这就是HashSet的核心秘密。
      我们再看add()方法，发现增加一个元素说白了就是在map中增加一个键值对，键对象就是这个元素，值对象是名为PRESENT的Object对象。
      说白了，就是“往set中加入元素，本质就是把这个元素作为key加入到了内部的map中”。

      由于map中key都是不可重复的，因此，Set天然具有“不可重复”的特性。
     */

    public static void main(String[] args) {

        Set<String> s = new HashSet<>();
        s.add("aa");
        s.add("bb");
        s.add("aa");  //无法插入重复值
        s.add(null);
        s.add(null); // 只能插入一次 null 值

        System.out.println(s);

        s.remove("bb");
        System.out.println(s);


        Set<String> s2 = new HashSet<>();
        s2.add("哈哈哈");
        s2.addAll(s);
        System.out.println(s2);

        /*
        HashSet的本质就是 简化版的HashMap
         */
    }
}
