package object_oriented2;

/**
 * @Author: huangxinjian
 * @Description: 访问控制符
 * @Date: Created in 17:25 2019/1/30
 * @Modified By:
 */
public class AccessControlCharacter {

    /*
    访问控制符一共有以下几类：
                            同一个类    同一个包    子类    所有类
            private            *
            default            *           *
            protected          *           *         *
            public             *           *         *        *

            因此，private只能在当前类中使用
            default是当我们什么都不写的时候，默认就是这个  例如  int age ;  就相当于  default int age ;只能在当前类或同一个包中的其他类使用
            protected  则在子类中、同一个包中、同一个类中都能直接访问到
            public 则所有类都能访问的到
     */
}
