package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @Author: huangxinjian
 * @Description:    捕获异常
 * @Date: Created in 15:38 2019/2/15
 * @Modified By:
 */
public class CatchException {

    /*
    捕获异常通过3个关键字来实现 ： try、catch、finally

            try块用来执行我们的程序，如果出现异常，系统抛出一个异常，在catch块中捕获并处理

            最后一步是通过finally语句为异常处理提供一个统一的出口，
            finally所指定的代码都要被执行
            !!!!!!!!!!!(catch语句可有多条;finally语句最多只能有一条，根据自己的需要可有可无)
     */


    /*
    try块注意事项：

         一个try语句必须带有至少一个catch语句块或一个finally语句块 。
     */

    /*
    catch块注意事项：

        1. 每个try语句块可以伴随一个或多个catch语句，用于处理可能产生的不同类型的异常对象。
        2. catch块中的常用方法:（通通继承于  Throwable 类）
                2.1 toString() 显示异常的类名和产生异常的原因
                2.2 getMessage() 只显示产生异常的原因，但是不显示类名
                2.3 printStackTrace()  用来跟踪异常事件发生时堆栈的内容

        3. catch 捕获异常的捕获顺序
               注意：如果异常间中继承关系，需要把父类异常往下面放，不然捕获的所有子类异常都会在父类中处理，而不是在子类异常中
               因此我们必须先 捕获 子异常，再捕获 父异常
     */

    /*
     finally：

      有些语句，不管是否发生了异常，都必须要执行，那么就可以把这样的语句放到finally语句块中。

      ！！！！！通常在finally中关闭程序块已打开的资源，比如：关闭文件流、释放数据库连接等。
     */


    /*
    try catch finally 语句块执行过程：
        1. 首先执行 try块中的代码
                1.1 如果try块中没有抛出异常，则执行finally语句块；
                1.2 如果try块中抛出了异常，则根据异常类型跳转到相应的catch语句块；

        2. catch语句块可以有一个，也可以有多个，用来分别捕获不同类型的异常，执行完catch语句块后会继续执行finally语句块

        3. finally语句块是可选的，如果有的话，则不管是否发生异常，都会执行finally语句块


        要注意的是 :

                即使 try块和 catch语句块中存在着 return语句，finally语句块也会执行，
                    而且是先执行完 finally 后再通过 return 语句退出
     */

    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("d:\\a.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
