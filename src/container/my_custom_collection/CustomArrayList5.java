package container.my_custom_collection;

/**
 * @Author: huangxinjian
 * @Description:  自定义 ArrayList 版本5
 *                  新增 remove 方法
 * @Date: Created in 20:14 2019/2/16
 * @Modified By:
 */
public class CustomArrayList5<T> {

    /*
       ArrayList的核心成员变量有  Object[]  和 int size
     */
    private Object[] elementDatas;   //用来存放数据的数组
    private int size;               //容器的大小 ，即非数组的大小，size < 数组的长度
    private static final int DEFAULT_CAPACITY = 10;   // 默认容量 capacity 容量的意思


    /**
     *  无参构造器，给 Object[] 默认初始化10个长度
     */
    public CustomArrayList5() {
        elementDatas = new Object[DEFAULT_CAPACITY];
    }


    /**
     *  我们也可以传入我们自定义的容量
     * @param capacity  容量
     */
    public CustomArrayList5(int capacity) {

        if (capacity > 0){
            elementDatas = new Object[capacity];
        }else if(capacity ==0 ){
            elementDatas = new Object[DEFAULT_CAPACITY];
        }else {
            throw new IllegalArgumentException("容量不能为负数");
        }
    }

    /**
     * 自定义 get 方法
     * @param index
     * @return
     */
    public T get(int index){
        checkRange(index);
        return (T) elementDatas[index];
    }


    /**
     * set方法，用于修改 ArrayList的值
     * @param element
     * @param index
     */
    public void set(T element, int index){
        checkRange(index);
        elementDatas[index] = element;
    }

    /**
     * 检查 索引是否合法
     * @param index
     */
    public void checkRange(int index){
        //检查索引合不合法
        if (index < 0 || index > size - 1){
            throw new RuntimeException("索引不合法:"+index);
        }
    }


    /**
     * 自定义 add 方法
     * @param element
     */
    public void add(T element){

        //什么时候开始扩容
        if (size == elementDatas.length-1){
            //先定义一个更大的数组,由于移位运算符优先级较低，因此需要加括号
            Object[] newArrays = new Object[elementDatas.length + (elementDatas.length >> 1)];  //右移一位 除以2
            //进行数组拷贝
            System.arraycopy(elementDatas,0,newArrays,0,elementDatas.length);
            //让原数组引用指向新数组
            elementDatas = newArrays;
            newArrays = null;
        }
        elementDatas[size++] = element;
    }


    /**
     * 根据对象来remove
     * @param o
     * @return
     */
    public boolean remove(Object o){

        //首先判断 o 是否为 null 对象
        if (o == null){
            for (int i = 0 ; i < size;i++){
                if (elementDatas[i] == null){
                    fastRemove(i);
                    return true;
                }
            }
        }
        else {
            for (int i = 0 ; i < size;i++){
                if (o.equals(elementDatas[i])){
                    fastRemove(i);
                    return true;
                }
            }
        }
        return false;

    }

    /**
     * 根据索引来 remove 掉原来的值，并返回remove的对象
     * @param index
     * @return
     */
    public T remove(int index){

        checkRange(index);
        //核心代码
        T temp = (T) elementDatas[index];
        elementDatas[index] = null;
        //拷贝的长度
        int numMoved = size - index - 1;
        //数据拷贝，如果 ==0 ，则为删除最后一个
        if (numMoved > 0) {
            System.arraycopy(elementDatas, index + 1, elementDatas, index, numMoved);
        }
        //容器大小减一
        elementDatas[--size] = null;
        return temp;
    }


    /**
     * 无返回值的remove
     */
    public void fastRemove(int index){
        int numMoved = size - index - 1;
        //数据拷贝，如果 ==0 ，则为删除最后一个
        if (numMoved > 0) {
            System.arraycopy(elementDatas, index + 1, elementDatas, index, numMoved);
        }
        //容器大小减一
        elementDatas[--size] = null;
    }

    /**
     * 重写 toString方法
     * @return
     */
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size ; i++){
            sb.append(elementDatas[i]+",");
        }
        sb.setCharAt(sb.length()-1,']');
        return sb.toString();
    }


    public static void main(String[] args) {

        CustomArrayList5<String> c = new CustomArrayList5<String>();
        c.add("aa");
        c.add("bb");
        System.out.println(c.toString());
        c.add("cc");
        System.out.println(c.toString());

        System.out.println(c.get(2));
        // c.set("ww",-1);  抛出异常
        c.set("ww",1);
        System.out.println(c);
        c.remove(1);
        System.out.println(c);
        c.add("gg");
        System.out.println(c);
        c.remove("aa");
        System.out.println(c);
    }
}
