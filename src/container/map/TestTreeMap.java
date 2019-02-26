package container.map;

import java.util.Map;
import java.util.TreeMap;

/**
 * @Author: huangxinjian
 * @Description:  测试 treeMap
 *
 *  TreeMap不支持null键，但是支持null值
 * @Date: Created in 9:35 2019/2/25
 * @Modified By:
 */
public class TestTreeMap {

        /*
                TreeMap 是红黑二叉树的典型实现，核心代码

                private transient Entry<K,V> root = null;  //根节点设为null，即黑色

                 static final class Entry<K,V> implements Map.Entry<K,V> {
                        K key;
                        V value;
                        Entry<K,V> left;
                        Entry<K,V> right;
                        Entry<K,V> parent;
                        boolean color = BLACK;
                  }


                HashMap效率高过 TreeMap，如果我们需要使用到 排序，就可以使用 TreeMap

         */

    public static void main(String[] args) {

        Map<String, Integer> ts = new TreeMap<>();
        ts.put("一", 1);
        ts.put("二", 2);
        ts.put("三", null);
        // ts.put(null, 4);  Exception in thread "main" java.lang.NullPointerException
        System.out.println(ts.get("三"));
        // System.out.println(ts.get(null));  Exception in thread "main" java.lang.NullPointerException


        Map<Integer,String> map = new TreeMap<>();
        map.put(20,"aa");
        map.put(3,"bb");
        map.put(6,"cc");

        // keySet 返回key的一个set集合
        for (Integer i: map.keySet()) {
            /*
              输出：           可以看到，key被自动进行了递增排序
                    3---bb
                    6---cc
                    20---aa
             */
            System.out.println(i+"---"+map.get(i));
        }

        Map<Emp,String> map1 = new TreeMap<>();
        map1.put(new Emp(100,"张三",50000),"张三哈哈哈");
        map1.put(new Emp(150,"李四",5000),"李四哈哈哈");
        map1.put(new Emp(200,"王五",6000),"王五哈哈哈");
        map1.put(new Emp(50,"赵六",6000),"赵六哈哈哈");

        // keySet 返回key的一个set集合，按照key递增方式排序
        for (Emp i: map1.keySet()) {
            System.out.println(i+"---"+map1.get(i));
        }
    }
}


/*
如果我们想在key中使用我们自定义的 class，并让它进行排序，我们需要实现 Comparable 接口
 */

class Emp implements Comparable<Emp>{

    int id;
    String name;
    double salary;

    public Emp(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     * @Description 比较这个对象和指定的传入的对象为了排序
     *
     * 返回一个 负数、0、整数对应这个对象如果小于、等于、大于这个指定的传入的参数
     * @param o
     * @return
     */
    @Override
    public int compareTo(Emp o) {  // 负数：小于 0：等于  正数：大于

        if (this.salary > o.salary){
            return  1;
        }else if (this.salary < o.salary){
            return -1;
        }else{  //如果工资相同，比较id
            if (this.id > o.id){
                return 1;
            }else if (this.id < o.id){
                return -1;
            }else{
                return 0;
            }
        }
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
