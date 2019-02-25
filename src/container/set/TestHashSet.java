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
     */

    public static void main(String[] args) {

        Set<String> s = new HashSet<>();
        s.add("aa");
        s.add("bb");
        s.add("aa");  //无法插入重复值

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
