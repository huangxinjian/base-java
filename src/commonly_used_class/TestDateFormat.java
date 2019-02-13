package commonly_used_class;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: huangxinjian
 * @Description:  测试 时间对象和字符串对象之间的互相转化  DateFormat 抽象类和 SimpleDateFormat实现类的使用
 * @Date: Created in 12:51 2019/2/10
 * @Modified By:
 */
public class TestDateFormat {


    /*

            字母      日期或时间元素         表 示        示 例
             G          Era标识符            Text          AD
             y             年                Year     1996；96（yyyy ; yy）
             M          年中的月份           Month    July；Jul；07
             w          年中的周数           Number        27
             W         月份中的周数          Number        2
             D          年中的天数           Number       189
             d         月份中的天数          Number        10
             F         月份中的星期          Number        2
             E         星期中的天数          Text       Tuesday;Tue
             a          Am/pm 标记           Text          PM
             H      一天中的小时数（0~23）   Number        0
             k      一天中的小时数（1~24）   Number        24
             K     am/pm 中的小时数（0~11）  Number        0
             h     am/pm 中的小时数（1~12）  Number        12
             m       小时中的分钟数          Number        30
             s         分钟中的秒数          Number        55
             S          毫秒数               Number       978
             z           时区
             Z           时区

     */
    public static void main(String[] args) throws ParseException {

       // 把时间对象按照“格式字符串指定的格式”转成相应的字符串
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); //先定义一个日期的格式
        String str = df.format(new Date(400000));   //如果想  date 转 String ，就使用 format 方法
        System.out.println(str);

        //将字符串按照“格式字符串指定的格式”转成相应的字符串
        DateFormat df1 = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
        Date date = df1.parse("2019年8月12日 15时32分24秒");  //如果想 String 转 date，就使用 parse方法
        System.out.println(date);



    }
}
