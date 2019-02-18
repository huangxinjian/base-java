package container;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: huangxinjian
 * @Description:  在容器中使用泛型
 * @Date: Created in 11:09 2019/2/16
 * @Modified By:
 */
public class GenericityForContainer {

    public static void main(String[] args) {


        /*
        通过查看 List的源码，我们可以看到
                List 在定义的时候也是使用的泛型来定义 List 容器： public interface List<E> extends Collection<E>

         ArrayList也是如此：
         public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, java.io.Serializable
         */
        List<String> list = new ArrayList<String>();

        /*
        public interface Map<K,V>
         */
        Map<String,String> map = new HashMap<>();


    }
}
