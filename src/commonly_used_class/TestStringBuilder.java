package commonly_used_class;

/**
 * @Author: huangxinjian
 * @Description:  测试 StringBuilder StringBuffer 可变字符序列对象
 * @Date: Created in 11:27 2019/2/10
 * @Modified By:
 */
public class TestStringBuilder {

    public static void main(String[] args) {

        //StringBuilder线程不安全，效率高（* 推荐使用）
        //StringBuffer线程安全，效率低
        StringBuilder stringBuilder = new StringBuilder("abcdef");

        System.out.println(Integer.toHexString(stringBuilder.hashCode()));  //输出地址
        System.out.println(stringBuilder);  //输出值

        stringBuilder.setCharAt(2,'M');  //对值进行修改,注意需要是单引号

      System.out.println(Integer.toHexString(stringBuilder.hashCode()));  //输出地址
        System.out.println(stringBuilder);  //输出值

        /*
        1b6d3586
        abcdef
        1b6d3586
        abMdef

        可以看到，它们的地址相同，因此对象还是那个对象，但是值变了，因此 StringBuilder 是可变字符序列

         */
    }
}
