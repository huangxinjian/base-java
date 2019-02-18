package container;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Author: huangxinjian
 * @Description:  测试 List
 * @Date: Created in 15:28 2019/2/16
 * @Modified By:
 */
public class TestList {

    /*
        List 是 有序、可重复的 容器

            有序： 即List里面的元素都是有索引标记，可以根据元素的索引标记（在List中的位置）来访问元素
            可重复的： List允许加入重复的元素。更确切的讲，List通常允许满足 e1.equals(e2) 的元素重复加入到容器中

        List 接口常用的实现类有 3 个：
                ArrayList : 我们最常用这个，底层实现是用数组实现的
                LinkedList ： 底层实现是用链表实现的
                Vector ： 底层实现是用数组实现的，是线程安全的


        Set 是无序的，不可重复的容器
     */

    public static void main(String[] args) {
        testBasicCollectMethod();
    }

    public static void testBasicCollectMethod(){
        /*
        List接口是 Collection 接口的子类，因此 Collection接口的方法 List接口也有，下面就演示以下
         */

        Collection<String> c = new ArrayList<>();

        System.out.println(c.size());  //输出 容器 的大小  size() 方法
        System.out.println(c.isEmpty());  //判断容器是否为空

        c.add("黄欣健");
        c.add("黄馨仪");
        System.out.println(c);
        System.out.println(c.size());


        Object[] objects = c.toArray(); //可以把容器转化成 Object 数组
        System.out.println(objects);

        System.out.println(c.contains("黄欣健"));  // contains()  测试 容器c中是否包含某个 object 对象，底层使用了equal方法


        c.remove("黄馨仪");  //注意，remove只是移除了 c 容器栈中引用指向的地址，并没有删除 "黄馨仪" 这个对象
        System.out.println(c);

        c.clear();   //同理，只是清除了全部 容器c中的地址
        System.out.println(c);
    }


    public static void testUpperMethod(){
        /*
        上面介绍了 单个集合 本身的方法，下面介绍以下，两个集合之间的方法：

                addAll()
                containsAll()
                removeAll()
                retainsAll()
         */

        List<String> list01 = new ArrayList<>();
        list01.add("aa");
        list01.add("bb");
        list01.add("cc");

        List<String> list02 = new ArrayList<>();
        list02.add("aa");
        list02.add("dd");
        list02.add("ee");


        System.out.println("list01:"+list01);  //[aa, bb, cc]

        // 1. addAll(Collection c) 将容器c中的所有数据添加到本容器中
        // list01.addAll(list02);  // [aa, bb, cc, aa, dd, ee]

        // 2. removeAll(Collection c) 将容器c与本容器中相同的数据的移除，注意，只移除本容器，容器c的数据不变
        // list01.removeAll(list02);  //[bb, cc] 移除了 aa

        // 3. retainsAll(Collection c)  只保留 本容器和容器c中相同的数据
        // list01.retainAll(list02);  // [aa]

        // 4. containsAll(Collection c)  本容器中是否包含容器c中的所有数据
        System.out.println(list01.containsAll(list02));  //false
        list02.remove("dd");
        list02.remove("ee");
        System.out.println(list01.containsAll(list02));  // true


        System.out.println("list01:"+list01);

    }


    /*
    测试索引相关的方法,注意，这些方法都是 实现类的方法，不是  List和Collection的
            get(int index)
            set(int index,E e )
            add(int index,E e )
            remove(int index)
            indexOf(Object o)
            lastIndexOf(Object o)
     */
    public static void testIndexMethod(){
        List<String> list01 = new ArrayList<>();
        list01.add("A");
        list01.add("B");
        list01.add("C");
        list01.add("D");  // add(Object o) 是在 List的后面追加元素

        System.out.println("list01: " +list01);

        list01.add(2,"黄欣健");  //在索引2这个位置插入这个数据，其余数据往后退一位
        System.out.println("list01: " +list01);

        list01.remove(2);   // 移除索引2的元素，其他元素往前进一位
        System.out.println("list01: " +list01);

        list01.set(2,"黄欣健");  //修改索引2位置的元素的数据
        System.out.println("list01: " +list01);

        System.out.println(list01.get(2));  //获取 索引2的值


        list01.add("C");
        list01.add("B");
        list01.add("A");

        System.out.println("list01:"+list01);  // [A, B, 黄欣健, D, C, B, A]

        // indexOf方法，返回第一个出现的指定元素的下标
        System.out.println(list01.indexOf("B"));  // 1

        // lastIndexOf方法，返回最后一个出现的指定元素的下标
        System.out.println(list01.lastIndexOf("B")); //5







    }
}
