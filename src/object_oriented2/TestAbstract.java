package object_oriented2;

/**
 * @Author: huangxinjian
 * @Description:  abstract 关键字
 * @Date: Created in 11:57 2019/2/7
 * @Modified By:
 */
public class TestAbstract {

}

/**
 * 父类： 花
 */
abstract class  Flower{

    /*
    抽象方法 不需要写实现，实现交给子类来进行重写
           定义了抽象方法的类，一定是抽象类，因此我们需要在flower前面加 abstract
           但是抽象类不一定要有抽象方法！！！！！！！
     */
    abstract public void open();  //这是一个抽象方法 open

    /*
    抽象类中也可以定义普通方法
     */
    public void waitOpen(){
        System.out.println("等待开花中。。。");
    }

    /*
    抽象类中可以有 成员变量、成员方法、构造方法
    但是不能 new 对象
    构造方法只能通过子类的构造方法来调用，无法自己调用
     */

}
