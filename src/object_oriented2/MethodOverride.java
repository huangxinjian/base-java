package object_oriented2;

/**
 * @Author: huangxinjian
 * @Description: 方法重写
 * @Date: Created in 15:44 2019/1/30
 * @Modified By:
 */
public class MethodOverride {

     /*
     方法重写的要点：
           1. 方法名称和参数列表要相同
           2. 返回值类型需要 小于或等于父类
           3. 访问权限要大于或等于父类
           4. 重写时子类抛出的异常必须小于或等于父类抛出的异常

           重写属于继承，重载属于同一个类
      */


}

class Vehicle { // 交通工具类
    public void run() {
        System.out.println("跑....");
    }
    public void stop() {
        System.out.println("停止不动");
    }

    public Vehicle show(){
        System.out.println("这只是交通工具");
        return null;
    }
}
class Horse extends Vehicle { // 马也是交通工具
    public void run() { // 重写父类方法
        System.out.println("四蹄翻飞，嘚嘚嘚...");
    }

//    public Object show(){  //这里可以返回Horse 也可以返回 Vehicle都属于重写，但是不能返回Object，因为范围比父类还高
//        System.out.println("这只是交通工具");
//        return null;
//    }
}

class Plane extends Vehicle {
    public void run() { // 重写父类方法
        System.out.println("天上飞！");
    }
    public void stop() {
        System.out.println("空中不能停，坠毁了！");
    }
}
