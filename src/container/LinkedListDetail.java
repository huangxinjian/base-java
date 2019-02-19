package container;

/**
 * @Author: huangxinjian
 * @Description:  LinkedListDetail
 * @Date: Created in 10:13 2019/2/18
 * @Modified By:
 */
public class LinkedListDetail {
    /*

        LinkedList 底层采用的是 双向链表 实现的存储，具有 查询效率低，增删效率高 的特点。


        数据结构：
            class  Node {
                Node  previous;     //前一个节点
                Object  element;    //本节点保存的数据
                Node  next;         //后一个节点
            }


        底层 get 方法使用的是 二分查找法
        Node<E> node(int index) {
        // assert isElementIndex(index);

        if (index < (size >> 1)) {
            Node<E> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Node<E> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }
     */
}
