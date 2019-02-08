package object_oriented2;

/**
 * @Author: huangxinjian
 * @Description: String常量池
 * @Date: Created in 14:07 2019/2/7
 * @Modified By:
 */
public class TestString {

    /*
    String类又称作不可变字符序列
            我们用 双引号“”包起来的内容都是一个 String对象，而且这些对象会被放置到 String的常量池的，这样当我们下次使用的时候
            就可以，直接把引用指向该地址即可。
     */
    public static void main(String[] args) {
        String a = "123";
        String b = "123";
        System.out.println(a==b); //输出true，因为地址相同
        String c= new String("123");
        System.out.println(a==c); //虽然内容一样，但是地址不同，输出false

        //因此，字符串的比较要使用equal
        System.out.println(a.equals(c)); //输出true
    }
}
