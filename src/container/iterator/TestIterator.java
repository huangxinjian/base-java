package container.iterator;

import java.util.*;

/**
 * @Author: huangxinjian
 * @Description:  测试迭代器Iterator遍历 List、Map、Set
 * @Date: Created in 10:23 2019/2/27
 * @Modified By:
 */
public class TestIterator {

    public static void main(String[] args) {
        testIteratorForMap2();
    }

    public static void testIteratorForList(){

        List<String> aList = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            aList.add("a" + i);
        }
        System.out.println(aList);
        for (Iterator<String> iter = aList.iterator(); iter.hasNext();) {
            String temp = iter.next();  ////每个集合类都会有一个内部类实现了 iterator接口
            System.out.print(temp + "\t");
            if (temp.endsWith("3")) {// 删除3结尾的字符串
                iter.remove();  //  如果遇到遍历容器时，判断删除元素的情况，使用迭代器遍历!
            }
        }
        System.out.println();
        System.out.println(aList);

        //由于List继承了 Collection，而Collection继承了Iterable
        // 在Iterable中有个 iterator() 方法，它能帮我们返回该集合的 Iterator

        /*
            每个 Iterator 我们可以看作 当前集合的一个项
                        hashNext()  判断当前项还有没有下一项
                        next()      移动指针到下一项并返回当前项的值
                        remove()    移除最后一项
         */

    }

    public static void testIteratorForSet(){

        Set<String> set = new HashSet<String>();
        for (int i = 0; i < 5; i++) {
            set.add("a" + i);
        }
        System.out.println(set);  // [a1, a2, a3, a4, a0] 因为 hashSet 是通过 key 散列而存放的
        for (Iterator<String> iter = set.iterator(); iter.hasNext();) {
            String temp = iter.next();  ////每个集合类都会有一个内部类实现了 iterator接口
            System.out.print(temp + "\t");
            if (temp.endsWith("3")) {// 删除3结尾的字符串
                iter.remove();
            }
        }
        System.out.println();
        System.out.println(set);

      
    }

    /**
     * 通过  entrySet 来获取 Entry的Set集合 再使用 迭代器遍历
     */
    public static void testIteratorForMap1(){

        Map<Integer,String> map = new HashMap<>();
        map.put(100,"aa");
        map.put(200,"bb");
        map.put(300,"cc");

        /**
         *  map遍历的关键在于，要遍历的是map中的每一个节点，而不是像List那样遍历一个值
         *  因此我们需要取到在 Iterator 中的是每一个节点
         */

        Set set = map.entrySet();  // 第一个方法就是调用 map 的  entrySet 方法，获取到所有 Entry 的Set集合
        for (Iterator<Map.Entry<Integer,String>> ite = set.iterator();ite.hasNext();){
            Map.Entry<Integer,String> entry = ite.next();
            System.out.println(entry.getKey() + "---" +entry.getValue());
        }
    }

    /**
     * 通过  keySet 来获取 key的Set集合再使用迭代器遍历
     * 通过map的keySet()、valueSet()获得key和value的集合，从而遍历它们
     */
    public static void testIteratorForMap2(){
        Map<Integer,String> map = new HashMap<>();
        map.put(100,"aa");
        map.put(200,"bb");
        map.put(300,"cc");

        Set set = map.keySet();

        for (Iterator<Integer> ite = set.iterator();ite.hasNext();){
            Integer key = ite.next();
            System.out.println(key + "---" + map.get(key));
        }

        Collection collection = map.values();
        for (Iterator<String> ite = collection.iterator();ite.hasNext();){
            String value = ite.next();
            System.out.println(value + "---" );
        }


    }
}
