package container;

/**
 * @Author: huangxinjian
 * @Description:  泛型
 * @Date: Created in 10:08 2019/2/16
 * @Modified By:
 */
public class Genericity {

    /*
            泛型是JDK1.5后添加的，它可以帮我们建立 类型安全的容器

            泛型的本质其实就是  “数据类型参数化”，即不明确表明这个 变量是什么类型的，例如 int a 写成 T a
                因此我们可以把泛型理解为数据类型的一个占位符（形式参数），即告诉编译器，在调用泛型的时候必须传入实际类型
     */

    public static void main(String[] args) {


        /*
        可以看到，在未定义泛型的情况下，一个容器里面可以存放多种类型的数据，这样就比较杂乱，不方便管理
         */
        MyCollection myCollection = new MyCollection();
        myCollection.set("黄欣健",0);
        myCollection.set(8888,1);

        String name = (String) myCollection.get(0);
        Integer money = (Integer) myCollection.get(1);

        /*
        下面引入泛型，将容器统一为同一种数据类型
         */

        //我们在new的时候通过<>传递 实际参数 String，从而统一容器类型
        MyCollection2<String>  myCollection2 = new MyCollection2<String>();
        myCollection2.set("黄欣健",0);
//        myCollection2.set(7888,1);  //这里会报错，因为容器已经锁定为 String 类型的了，无法存放其他类型
        String s = myCollection2.get(0);  //这里也不需要 向下强制转型，因为已经被遍历器帮我们处理为 String类型了
    }
}


/**
 * 自定义一个非泛型的容器
 */
class MyCollection{

    Object[] objs = new Object[5];

    public void set(Object o,int index){
        objs[index] = o;
    }
    public Object get(int index){
        return objs[index];
    }
}


/**
 * 自定义泛型，我们可以把泛型看作是一种 数据类型的形式参数
 * 泛型可以用 <T,E,V> 来表示
 * 当我们实际new MyCollection2 这个对象的时候，我们再确定好泛型的真实类型是什么
 *
 *
 *    泛型T像一个占位符一样表示“未知的某个数据类型”，我们在真正调用的时候传入这个“数据类型”。
 *
 * @param <T>
 */
class MyCollection2<T>{

    Object[] objs = new Object[5];

    public void set(T o,int index){
        objs[index] = o;
    }
    public T get(int index){
        return (T) objs[index];
    }
}