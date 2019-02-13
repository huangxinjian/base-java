package commonly_used_class;

import org.omg.CORBA.DATA_CONVERSION;

import java.util.Date;

/**
 * @Author: huangxinjian
 * @Description:  Date类
 * @Date: Created in 12:23 2019/2/10
 * @Modified By:
 */
public class TestDate {
    /*
    Date是Java的时间类，时间的基准是  1970年0-0-0

        我们用 long 类型表示时间
     */

    public static void main(String[] args) {

        /*
        这里我们不传任何值，调用的是默认的构造函数
         public Date() {
            this(System.currentTimeMillis());  //核心代码
        }
         */
        Date date = new Date();  //这里导入的是 util 包
        //因此，date代表的是当前时刻
        long time = System.currentTimeMillis();  //这个与上面的date 是一样的

        System.out.println(date  + "---" + time);

        /*
        Date类的一些方法

            1.  Date() 构造函数 ：分配一个Date对象，并初始化此对象为系统当前的日期和时间，可以精确到毫秒
            2.  Date(long date) 分配 Date 对象并初始化此对象，
                                以表示自从标准基准时间(称为“历元(epoch)”，即 1970 年 1 月 1 日 00:00:00 GMT)以来的指定毫秒数。
            3.  boolean after(Date when) 测试此日期是否在指定日期之后。
            4.  boolean before(Date when) 测试此日期是否在指定日期之前。、
            5.  boolean equals(Object obj) 比较两个日期的相等性。
            6.  long getTime() 返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
            7. String toString() 把此 Date 对象转换为以下形式的 String：
                     dow mon dd hh:mm:ss zzz yyyy 其中： dow 是一周中的某一天 (Sun、 Mon、Tue、Wed、 Thu、 Fri、 Sat)。
         */
        Date a = new Date();  //系统当前的时间和日期
        Date b = new Date(2000);  // 1970年后1月1日 00：00 ：00  过了2000毫秒后的时间
        Date c = new Date(2000);

        boolean flag = a.after(b);  //判断 a 的时间是否在 b之后
        System.out.println(flag);
        flag = b.before(a);
        System.out.println(flag);  //判断 b 的时间是否在 a 之前

        /*
         getTime() 获取this对象的毫秒数  && 短路与，一个不符合就直接 false
         public boolean equals(Object obj) {
            return obj instanceof Date && getTime() == ((Date) obj).getTime();
        }
         */
        System.out.println(c.equals(b)); //比较 c 和 b 的相等

        long l = a.getTime();  //获取 a 的毫秒数


        System.out.println(a.toString());

        /**
         * 查看API文档大家可以看到其实Date类中的很多方法都已经过时了。
         * JDK1.1之前的Date包含了：日期操作、字符串转化成时间对象等操作。
         * JDK1.1之后，
         *          日期操作一般使用Calendar类，
         *          而字符串的转化使用DateFormat类。
         */


    }
}
