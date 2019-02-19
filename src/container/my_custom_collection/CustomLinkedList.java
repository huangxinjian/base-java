package container.my_custom_collection;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: huangxinjian
 * @Description:  自定义 LinkedList 版本1
 * @Date: Created in 10:20 2019/2/18
 * @Modified By:
 */
public class CustomLinkedList {



    private Node first;  // 头节点
    private Node last;   // 下一个节点,这个节点永远都指向最后一个节点

    int size;

    public CustomLinkedList() {

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
            size++;
        }else{
            // ["a","b","c"]
            node.setPrevious(last);  //把新建节点的头节点指向上一个节点的数据节点
            node.setNext(null);  //然后把下一个节点置null
            last.setNext(node);  //将 b的next指向c
            last = node;        // 移动last节点
            size++;
        }

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




    public static void main(String[] args) {
        CustomLinkedList c = new CustomLinkedList();
        c.add("aa");
        c.add("bb");
        c.add("cc");
        System.out.println(c);


    }

}
