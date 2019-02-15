package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @Author: huangxinjian
 * @Description:    抛出异常
 * @Date: Created in 16:36 2019/2/15
 * @Modified By:
 */
public class ThrowException {

    /*
    我们在编写程序的时候，不一定要立刻处理异常，我们可以通过 throws 关键字来抛出，让后面调用我们的那个方法来捕获处理
     */

    public static void main(String[] args) {
        try {
            function();
        } catch (FileNotFoundException e) {   //把异常交给 main 方法来处理
            e.printStackTrace();
        }
    }

    public static void function() throws FileNotFoundException {

            FileReader reader = new FileReader("d:\\a.txt");

    }
}
