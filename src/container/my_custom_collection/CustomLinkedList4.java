package container.my_custom_collection;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: huangxinjian
 * @Description:  自定义 LinkedList 版本4
 *                  增加 insert 方法
 * @Date: Created in 10:20 2019/2/18
 * @Modified By:
 */
public class CustomLinkedList4 {



    private Node first;  // 头节点
    private Node last;   // 下一个节点,这个节点永远都指向最后一个节点

    int size;

    public CustomLinkedList4() {

    }

    /**
     * 在索引之前插入数据
     * @param index
     * @param o
     */
    public void add(int index, Object o){

        //检查索引是否合法
        if (index < 0 || index > size){
            throw new IllegalArgumentException("索引不合法");
        }

        if (index == size){ //说明在结尾插入
            add(o);
        }else {
            //要插入的节点
            Node newNode = new Node(o);
            //拿到该索引所代表的节点
            Node indexNode = getNode(index);
            //index-1的节点
            Node indexPrev = indexNode.getPrevious();

            if (indexPrev == null ){
                Node temp = first;
                newNode.setNext(temp);
                temp.setPrevious(newNode);
                first = newNode;
            }else {
                //将 index-1 节点的 next 节点指向新节点
                indexPrev.setNext(newNode);
                //将 newNode 的前节点指向 index-1 的节点
                newNode.setPrevious(indexPrev);
                //将 index 节点的前节点指向 newNode 节点
                indexNode.setPrevious(newNode);
                //将 newNode 节点的后界面指向 index节点
                newNode.setNext(indexNode);
            }
        }
        size++;

    }

    /**
     *  链表添加方法：
     *
     *  初始化时是  [ ]
     *  现在添加 ["a"]
     * @param obj
     */
    public void add(Object obj){

        //1. 新建一个节点,并存入我们要保存的数据
        Node node = new Node(obj);
        //2. 开始与链表建立关联关系
        if (first == null){   //说明是最开始为空的链表
            first = last = node;

        }else{
            // ["a","b","c"]
            node.setPrevious(last);  //把新建节点的头节点指向上一个节点的数据节点
            node.setNext(null);  //然后把下一个节点置null
            last.setNext(node);  //将 b的next指向c
            last = node;        // 移动last节点
        }
        size++;
    }

    @Override
    public String toString() {

        /**
         *  循环打印 LinkedList 链表
         */
        StringBuilder sb = new StringBuilder("[");
        Node temp = first;  //定义一个中间节点指向头节点
        while(temp != null ){  //说明没有下一个节点了
            sb.append(temp.getElement()+",");
            temp = temp.getNext(); //temp指向下一个节点
        }
        sb.setCharAt(sb.length()-1,']');

        return sb.toString();
    }


    /**
     * 自定义 get 方法，利用二分法查找
     * @param index
     * @return
     */
    public Object get(int index){

        checkRange(index);
        Node node = getNode(index);
        return node != null ? node.getElement() : null;
    }

    /**
     * 检查 index 的范围
     * @param index
     */
    public void checkRange(int index){
        if (index <0 || index > size-1){
            throw new IllegalArgumentException("索引不合法");
        }
    }

    /**
     * 根据索引来 remove 链表数据
     * @param index
     * @return
     */
    public Object remove(int index){

        //检查index 的合法性
        checkRange(index);
        //首先拿到要 remove 的节点对象
        Node temp = getNode(index);

        Node pre = temp.getPrevious();   //该节点的上一个节点
        Node next = temp.getNext();     //该节点的下一个节点
        Object data = temp.getElement(); //该节点的数据

        if (pre == null){  //说明这个节点是第一个节点，我们就直接移动头节点的位置即可
            first = next;
        }else {
            pre.setNext(next);  //把前节点的next节点指向该节点的next节点
            temp.setPrevious(null);
        }

        if (next == null){  //说明是最后一个节点，移动 last 节点即可
            last = pre;
        }else {
            next.setPrevious(pre);
            temp.setNext(null);
        }
        temp.setElement(null);
        size--;
        return data;
    }

    /**
     * 根据索引获取节点
     * @param index
     * @return
     */
    public Node getNode(int index){
        Node node = null;

        // 使用二分查找法优化
        if (index <= (size >> 1)){
            node = first;
            for (int i = 0; i < index ; i ++ ){  //这里需要移动少一次
                node = node.getNext();      //从链表的头部往后移动
            }
        }else {
            node = last;
            for (int i = size - 1; i > index ; i -- ){
                node = node.getPrevious();   //从链表的尾部往前移动
            }
        }
        return node;
    }

    public static void main(String[] args) {
        CustomLinkedList4 c = new CustomLinkedList4();
        c.add("aa");
        c.add("bb");
        c.add("cc");
        c.add("dd");
        c.add("ee");
        System.out.println(c);
        System.out.println(c.get(2));

        Object o = c.remove(4);
        System.out.println(o);
        System.out.println(c);

        c.add(5,"gg");
        System.out.println(c);



    }

}
