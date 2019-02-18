package container;

/**
 * @Author: huangxinjian
 * @Description:  ArrayList详细解析
 * @Date: Created in 17:42 2019/2/16
 * @Modified By:
 */
public class ArrayListDetail {

    /*
            ArrayList 底层是用数组实现的，因此 查询效率高，但是增删效率低，而且线程不安全，但是我们一般使用它

            但是 ArrayList 是如何做到不限制容量的呢，是因为 底层中，假设我们定义的数组存放了10个数据
            当我们要插入第11个是， ArrayList 会创建一个 长度为 15 的数组，把10长度的数据的所有数据拷贝过来，继续插入第11个
            如果15的也满了，就继续创建15+15/2的长度的数组
     */

    /*
    ArrayList 一共有 两个构造器
         public ArrayList(int initialCapacity) {
            if (initialCapacity > 0) {
                this.elementData = new Object[initialCapacity];
            } else if (initialCapacity == 0) {
                this.elementData = EMPTY_ELEMENTDATA;
            } else {
                throw new IllegalArgumentException("Illegal Capacity: "+
                                                   initialCapacity);
            }
         }

         这是带参数的构造器，我们可以在定义的时候传入我们要定义的容器的大小


         public ArrayList() {
            this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
        }
        这是无参的构造器，初始化长度为 10
     */

}
