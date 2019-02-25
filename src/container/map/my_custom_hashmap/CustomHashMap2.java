package container.map.my_custom_hashmap;

import java.util.Arrays;

/**
 * @Author: huangxinjian
 * @Description:  自定义 HashMap 版本2
 *              重写 toString 方法
 * @Date: Created in 21:21 2019/2/23
 * @Modified By:
 */
public class CustomHashMap2 {


        Node2[] table;  //位桶数组 bucket Array
        int size;   // 存放的键值对的个数

        private static final int DEFAULT_ARRAY_LENGTH = 16;

    public CustomHashMap2() {
        this.table = new Node2[DEFAULT_ARRAY_LENGTH];
    }

    /**
     * 自定义 put 方法
     *
     * 如果要完善，需要考虑数组扩容问题
     * @param key
     * @param value
     */
    public void put(Object key,Object value){
        Node2 newNode = new Node2();
        newNode.hash = myHash(key.hashCode(),table.length);
        newNode.key = key;
        newNode.value = value;
        newNode.next = null;

        Node2 node = table[newNode.hash];  //先获取当前hash值索引的数组的值
        Node2 lastNode = null;  //当前遍历的最后一个节点
        boolean keyRepeat = false;  //key是否重复

        if (node == null){  //说明当前索引还没有存在值
            table[newNode.hash] = newNode;
            size++;
        }else {    //说明此处的值不为null，需要将新数据连接到当前Node后面

            while(node != null){
                // 如果key重复，则覆盖
                if (node.key.equals(key)){
                    System.out.println("key重复了");
                    node.value = value;
                    keyRepeat = true;
                    break;
                }else {
                    // 如果key不重复，则连接到最后面
                    lastNode = node;
                    node = node.next;
                }
            }
            if (!keyRepeat){
                lastNode.next = newNode;
            }

            size++;
        }
    }




    private int myHash(int keyHashCode,int length){
//        System.out.println(keyHashCode & (length-1)) ;  //计算hash值，使用位运算
//        System.out.println(keyHashCode % length) ;  //计算hash值，使用%运算

        return keyHashCode & (length-1);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("HashMap : [\n");

        //遍历 bucket 数组
        for (int i = 0 ; i < table.length ; i++){
            Node2 temp= table[i];
            sb.append("索引"+i+"----");
            //遍历 链表
            while (temp != null){
                sb.append(temp.key+":"+temp.value+" -> ");
                temp = temp.next;
            }
            sb.append("\n");
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        CustomHashMap2 c = new CustomHashMap2();
        c.put(10,"aa");
        c.put(11,"ww");
        c.put(12,"gg");
        c.put(13,"ff");
        c.put(14,"ee");
        c.put(20,"bb");
        c.put(30,"cc");
        c.put(14,"oo");  //因为整数的hashcode方法被重写了，因此会相等
        c.put(53,"pp");
        c.put(69,"uu");
        c.put(85,"mm");

        System.out.println(c);

    }
}
