package commonly_used_class;

import javafx.scene.input.DataFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @Author: huangxinjian
 * @Description:  可视化日历程序
 * @Date: Created in 15:44 2019/2/13
 * @Modified By:
 */
public class TestCalendar2 {


    public static void main(String[] args) throws ParseException {

        String dateStr = "2019年8月13日";
        DateFormat dataFormat = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = dataFormat.parse(dateStr);

        System.out.println("一\t二\t三\t四\t五\t六\t日");

        //将日期转换成Calendar对象
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        // System.out.println(calendar.get(Calendar.MONTH));  0~12 0代表1月

        calendar.set(Calendar.DAY_OF_MONTH,1);  //先把当天设置为1号
        // 然后获取 1号 是星期几，进行打印 \t
        for (int j = 1; j < calendar.get(Calendar.DAY_OF_WEEK)-1;j++){
            System.out.print("\t");
        }


        int maxDate = calendar.getActualMaximum(Calendar.DAY_OF_MONTH); //获取当前月最大天数
        for (int i = 1 ; i <= maxDate ;i++){

            System.out.print(calendar.get(Calendar.DAY_OF_MONTH)+"\t");

            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){  //逢星期六就换行
                System.out.println();
            }

            calendar.add(Calendar.DAY_OF_MONTH,1);  //天数 +1
        }
    }
}
