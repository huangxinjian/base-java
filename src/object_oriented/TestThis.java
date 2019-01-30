package object_oriented;

/**
 * @Author: huangxinjian
 * @Description: this 关键字
 * @Date: Created in 23:08 2019/1/29
 * @Modified By:
 */
public class TestThis {

    /*
    一个对象的创建过程:
            Student s = new Student();
         1. 先为方法开辟栈帧，存放变量 s
         2. 为Student对象开辟堆内存，从方法区中读取Student类的信息
         3. 先初始化Student类的成员变量赋值默认初始值，int默认赋值0，引用类型默认赋值null。boolean默认赋值false
         4. 这时候再执行显式初始化，例如我们在定义成员变量的时候这样定义： int age = 10;
         5. 最后再执行 构造方法
         6. 这时候就把堆的地址值赋值给栈帧中的变量 s


         因此:其实在构造方法之前，对象就已经被创建好了，因此构造方法只是另外一种赋值的手段而已。
     */

    /*
        而 this 的本质，其实就是 已经创建好的对象的地址，
        因此，在构造方法中使用this，实质上就代表创建好的对象，也就是当前对象。
     */

    int a;
    int b;
    int c;

    public TestThis(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public TestThis(int a, int b, int c) {
        this(a,b);
        this.c = c;
    }

    public void sing(){
        System.out.println("sing");
    }

    public void eat(){
        sing(); //相当于  this.sing()
        System.out.println("回家吃饭");
    }

    public static void main(String[] args) {
        /*
        注意，在静态方法中不能使用this，因为this是属于对象的，而静态方法或静态对象是输入类的，存在方法区中的
         */
        TestThis testThis = new TestThis(2,3);
        testThis.eat();
    }
}
