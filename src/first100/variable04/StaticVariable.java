package first100.variable04;

/**
 * @Author: huangxinjian
 * @Description:  静态变量
 * @Date: Created in 20:55 2019/1/25
 * @Modified By:
 */
public class StaticVariable {

    /*
    静态变量使用了 关键字 static 来修饰，它与成员变量不同，成员变量从属于对象，声明周期随着对象的创建和销毁而运转

    但是 静态变量 从属于类，生命周期随着 类的加载和卸载（系统启动就加载，系统停止就卸载） 而运转。
     */
    static int a ; //静态变量，从属于类
}
