package commonly_used_class;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @Author: huangxinjian
 * @Description:  Calendar 日期类
 * @Date: Created in 13:56 2019/2/13
 * @Modified By:
 */
public class TestCalendar {

    /*
    Calendar 是一个抽象类，提供了 日期计算的功能，比如: 年 月 日 时 分 秒 的展示和计算
    GregorianCalendar 是 Calendar 的实现类
     */
    public static void main(String[] args) {

        /*
        public GregorianCalendar(int year, int month, int dayOfMonth, int hourOfDay,int minute) {
            this(year, month, dayOfMonth, hourOfDay, minute, 0, 0);
        }

        我们使用上面的构造函数
         */
        Calendar calendar = new GregorianCalendar(2019,1,13,14,38,45);

        System.out.println(calendar);

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);  // 使用 Calendar.DATE 也可以

        System.out.println(year);

        /*
        注意：0-11表示所有的月份，因此 0 代表的是 一月
         */
        System.out.println(month+1);
        System.out.println(day);

        /*
        注意： 1-7 表示星期几， 1表示星期天 2表示星期一
         */
        int weekday = calendar.get(Calendar.DAY_OF_WEEK);  //星期几

        Calendar c2 = new GregorianCalendar();

        System.out.println(c2);  //什么都不传，默认日期是 今天

        // c2.set(filed,value);  这样来设置时间值
        c2.set(Calendar.YEAR,2011);
        System.out.println(c2);

        // 日期的计算
        Calendar c3 = new GregorianCalendar();
        c3.add(Calendar.YEAR,100);  //往后100年
        c3.add(Calendar.DATE,100);  //往后100天
        System.out.println(c3);

        // 日期对象和时间对象的转化
        Date d4 = c3.getTime();
        Calendar c4 = new GregorianCalendar();
        //时间对象转日期类
        c4.setTime(new Date());

        printCalendar(c4);
    }

    public static void printCalendar(Calendar calendar){

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;  //月份。范围控制在 1~12
        int day = calendar.get(Calendar.DATE);

        int weekday = calendar.get(Calendar.DAY_OF_WEEK)-1;  //星期几  范围控制在0~6
        char[] weekdayStr = {'日','一','二','三','四','五','六'};

        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.println(year+"年"+month+"月"+day+"日 "+hour+":"+minute+":"+second+"  周"+weekdayStr[weekday]);
    }
}
