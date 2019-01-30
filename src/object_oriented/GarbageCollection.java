package object_oriented;

/**
 * @Author: huangxinjian
 * @Description:  垃圾回收机制
 * @Date: Created in 17:43 2019/1/29
 * @Modified By:
 */
public class GarbageCollection {

    /*
    java垃圾回收机制：
        垃圾回收的要点：
                1. 发现无用对象
                2. 回收无用对象所占用的内存空间

        垃圾回收的两个方法：
                1. 引用计数法

                     在堆中，每个对象都会有一个引用计数器，每当它们被引用一次（a = new A() 这为 A的引用），计数就加一
                   当 a = null 时，对应的对象的引用就为0，这时候JVM就会自动帮我们回收这个垃圾内存。

                   但这种方法存在以下缺点：
                        1.  当  student a = new Student();
                                student b = new Student();
                                a.friend = b;
                                b.friend = a;
                            时，即使 我们将  a = b = null;  JVM还是无法帮我们启动垃圾回收机制
                             因为，在堆的两个对象中，都彼此互相引用着对方，因此它们的计数器都是1，而不是0

                2. 引用可达法（根搜索算法）
                　　程序把所有的引用关系看作一张图，
                    从一个节点GC ROOT开始，寻找对应的引用节点，找到这个节点以后，继续寻找这个节点的引用节点，
                    当所有的引用节点寻找完毕之后，剩余的节点则被认为是没有被引用到的节点，即无用的节点。


     */
}
