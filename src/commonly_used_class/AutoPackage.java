package commonly_used_class;

/**
 * @Author: huangxinjian
 * @Description: 自动装箱和自动拆箱
 * @Date: Created in 14:15 2019/2/8
 * @Modified By:
 */
public class AutoPackage {

    /*
    自动装箱：把基本数据类型转换成对象  JDK1.5后才出现的
      在JDK1.5以前， 使用 Integer i = 5；是错误的，必须使用 Integer i = new Integer(5)
      在JDK1.5后，使用 Integer i = 5 ; 是正确的，因为它为我们自动执行了 Integer i = Integer.valueOf(5),这就是自动装箱

    自动拆箱：对象转换成基本数据类型
        例如：  Integer i = 3;   int j = i;  这就是自动拆箱，实际上是调用了 intValue()方法

     总结：
            自动装箱就是JVM自动为我们执行了 Integer.valueOf() 方法
            自动拆箱就是调用包装类的 xxxValue() 方法  ，如 intValue（）、doubleValue()
     */

    public static void main(String[] args) {

        Integer a = 234;  //自动装箱：  实际上是 Integer a = Integer.valueOf(234)
        int b = a ; //自动拆箱，相当于  int b = a.intValue();

         /*
        缓存 -128 ~ 127 之间的数字  IntegerCache静态内部类
            实际就是 系统在初始化的时候，创建了一个 -128到127之间的缓存数组，如果我们定义的值在这个范围内，就直接取出，不用重新创建对象
         */
        Integer in1 = -128;
        Integer in2 = -128;
        System.out.println(in1 == in2);//true 因为128在缓存范围内，返回来的都是同一个数组的地址
        System.out.println(in1.equals(in2));//true
        Integer in3 = 1234;
        Integer in4 = 1234;
        System.out.println(in3 == in4);//false 因为1234不在缓存范围内
        System.out.println(in3.equals(in4));//true

    }

}
