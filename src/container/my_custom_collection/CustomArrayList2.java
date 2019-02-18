package container.my_custom_collection;

/**
 * @Author: huangxinjian
 * @Description:  自定义 ArrayList 版本2 新增泛型
 * @Date: Created in 20:14 2019/2/16
 * @Modified By:
 */
public class CustomArrayList2<T> {

    /*
       ArrayList的核心成员变量有  Object[]  和 int size
     */
    private Object[] elementDatas;   //用来存放数据的数组
    private int size;               //容器的大小 ，即数组的大小
    private static final int DEFAULT_CAPACITY = 10;   // 默认容量 capacity 容量的意思


    /**
     *  无参构造器，给 Object[] 默认初始化10个长度
     */
    public CustomArrayList2() {
        elementDatas = new Object[DEFAULT_CAPACITY];
    }


    /**
     *  我们也可以传入我们自定义的容量
     * @param capacity  容量
     */
    public CustomArrayList2(int capacity) {

        if (capacity > 0){
            elementDatas = new Object[capacity];
        }else if(capacity ==0 ){
            elementDatas = new Object[DEFAULT_CAPACITY];
        }else {
            throw new IllegalArgumentException("容量不能为负数");
        }
    }


    /**
     * 自定义 add 方法
     * @param element
     */
    public void add(T element){
        elementDatas[size++] = element;
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

        CustomArrayList2<String> c = new CustomArrayList2<String>();
        c.add("aa");
        c.add("bb");
        System.out.println(c.toString());
    }
}
