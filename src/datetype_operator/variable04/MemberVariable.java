package datetype_operator.variable04;

/**
 * @Author: huangxinjian
 * @Description: 成员变量
 * @Date: Created in 20:50 2019/1/25
 * @Modified By:
 */
public class MemberVariable {

    /*
    成员变量就是在 方法外部、类的内部定义的变量（无 static 修饰）
        它从属于对象，声明周期随着对象始终

     */

    int a;  //这就是成员变量 a

    /*
     注意：成员变量可初始化(int a = 18; 也可以)，也可不初始化 ，因为如果我们没有初始化，对于成员变量，会根据数据类型进行默认初始化

            类型           默认初始值
            int                0
           double             0.0
            char           '\u0000'
          boolean            false
     */
}
