package commonly_used_class;

/**
 * @Author: huangxinjian
 * @Description: String类
 * @Date: Created in 11:18 2019/2/10
 * @Modified By:
 */
public class TestString {

    /*
    String类是不可变字符序列,因为String类内部定义了   private final char value[];
        我们下面的 abcdef 就会存放到 该数组中，而且该数组被 final修饰的，即为常量，所以是不可变的

        当我们想进行修改的时候，例如 st2
            st1并不会有什么改变，只是st2获得了一个新的对象。
     */
    public static void main(String[] args) {
        String st1 = new String("abcdef");
        String st2 = st1.substring(2, 4);


        /*
        注意：在比较字符串的时候，不能用 == ，而是应该用 equal
         */

        //编译器做了优化,直接在编译的时候将字符串进行拼接
        String str1 = "hello" + " java";//相当于str1 = "hello java";
        String str2 = "hello java";
        System.out.println(str1 == str2);//true
        String str3 = "hello";
        String str4 = " java";
        //编译的时候不知道变量中存储的是什么,所以没办法在编译的时候优化
        String str5 = str3 + str4;
        System.out.println(str2 == str5);//false

    }
}
