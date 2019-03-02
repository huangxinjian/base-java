package container.iterator;

import java.util.*;

/**
 * @Author: huangxinjian
 * @Description:   所有遍历集合/容器的方法
 * @Date: Created in 11:22 2019/2/27
 * @Modified By:
 */
public class AllMethod {

    public static void main(String[] args) {
        trasverseMap();
    }

    /**
     * 遍历 List 集合方法
     */
    public static void traverseList1(){
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.set(1,"ww");

        /**
         *  第一种，for循环遍历
         */
        for (int i = 0;i<list.size(); i++){
            System.out.print(list.get(i)+"-");
        }

        System.out.println();

        /**
         *  第二种，增强for循环遍历
         */
        for (String temp : list){
            System.out.print(temp+"--");
        }
        System.out.println();
        /**
         *  第三种，使用 迭代器 Iterator 来遍历
         */
        for (Iterator<String> iterator = list.iterator();iterator.hasNext();){
            String temp = iterator.next();
            System.out.print(temp+"---");
        }
        System.out.println();
        /**
         *  第四种，使用 迭代器 while 循环遍历
         */
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String temp = iterator.next();
            iterator.remove();//如果要遍历时，删除集合中的元素，建议使用这种方式！
            System.out.println(temp);
        }
        System.out.println(list);
    }


    /**
     * 遍历 Set 集合方法
     */
    public static void traverseSet(){

        Set<String> set = new HashSet<>();
        set.add("aaa");
        set.add("ccc");
        set.add("bbb");

        /**
         *  因为 set 底层是 hashmap，数据都存在链表种，不存在数组，因此无法使用普通循环遍历
         *  只能使用 增强for循环
         */
        for (String temp : set
             ) {
            System.out.println(temp);
        }

        /**
         * 方法二：使用迭代器
         */
        System.out.println();

        for (Iterator<String> iterator = set.iterator();iterator.hasNext();){
            String temp = iterator.next();
            System.out.print(temp+"---");
        }
    }

    /**
     * 遍历 map 集合
     */
    public static void trasverseMap(){

        /**
         * 遍历map集合我们通常采用  keySet 或 EntrySet 方法来获取一个Set集合，再类似遍历Set集合一样遍历Map
         */

        Map<Integer, String> maps = new HashMap<Integer, String>();
        maps.put(1,"a");
        maps.put(3,"c");
        maps.put(2,"b");

        /**
         *  使用 keySet
         */
        Set<Integer>  keySet =  maps.keySet();
        for(Integer id : keySet){
            System.out.println(id+"---"+maps.get(id));
        }

        /**
         *  使用 entrySet
         */
        Set<Map.Entry<Integer, String>>  ss = maps.entrySet();
        for (Iterator iterator = ss.iterator(); iterator.hasNext();) {
            Map.Entry e = (Map.Entry) iterator.next();
            System.out.println(e.getKey()+"--"+e.getValue());
    }
}
}
