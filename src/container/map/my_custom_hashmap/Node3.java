package container.map.my_custom_hashmap;

/**
 * @Author: huangxinjian
 * @Description:  HashMap的节点  泛型节点
 * @Date: Created in 21:33 2019/2/23
 * @Modified By:
 */
public class Node3<K,V> {

    int hash;  //hash值
    K key;  // key
    V value;   //value
    Node3 next;  //下一个节点
}
