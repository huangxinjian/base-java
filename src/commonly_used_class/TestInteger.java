package commonly_used_class;

/**
 * @Author: huangxinjian
 * @Description:  Integer类
 * @Date: Created in 12:21 2019/2/8
 * @Modified By:
 */
public class TestInteger {

    public static void main(String[] args) {
        //基本数据类型转换成包装类对象
        Integer a = new Integer(127);
        //第二种方法，官方推荐
        Integer b = Integer.valueOf(30);  //静态方法


        System.out.println(a);

        /*
        byteValue() shortValue() intValue()、longValue()、floatValue()、doubleValue()
        所有的“数字型”包装类都可以互相转型。
         */
        System.out.println(a.byteValue());
        //把包装类转换成基本数据类型
        int i = a.intValue();
        double d = b.doubleValue();

        //把字符串转成包装类对象,注意，字符串中只能包含数字，不能包含其他符号，否则会抛出异常 NumberFormatException
        Integer c = new Integer("999");  //内部用的也是 parseInt
        Integer c2= Integer.parseInt("999");

        //包装类转字符串
        String s = a.toString();
        //或者
        String s1 = "" + a;



    }
}
