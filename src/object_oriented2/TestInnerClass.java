package object_oriented2;

/**
 * @Author: huangxinjian
 * @Description: 测试 非静态内部类
 * @Date: Created in 13:05 2019/2/7
 * @Modified By:
 */
public class TestInnerClass {

    public static void main(String[] args) {
        //创建内部类对象
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
    }
}

class Outer{
    private int age = 10;

    public void testOuter(){
        System.out.println("...");
    }

    /*
    非静态内部类里面不可以有：静态方法、静态成员、静态代码块
     */
    class Inner{
        int age = 20;
        public void show(){
            int age = 30;
            System.out.println("调用外部类Outer的成员变量age："+Outer.this.age);
            System.out.println("调用内部类Inner的成员变量age："+this.age);
            System.out.println("调用内部类Inner的局部变量age："+age);
        }
    }
}
