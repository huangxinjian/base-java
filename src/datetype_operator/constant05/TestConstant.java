package datetype_operator.constant05;

/**
 * @Author: huangxinjian
 * @Description: 测试常量
 * @Date: Created in 21:02 2019/1/25
 * @Modified By:
 */
public class TestConstant {

    public static void main(String[] args) {

        int age = 18;  //18是常量，但是age是变量
        /*
        java中的常量通常使用关键字 final 来修饰

               使用 final 修饰的成为 符号常量,
         */

        age = 10; //现在的age是可以被修改的


        //注意，常量的名称通常采用全大写和下划线组成
        final String name = "huangxinjian";
//        因此规范的写法如下
        final String NAME = "huangxinjian";
//        name = "黄欣健";  已经被 final 修饰的常量是不可以被修改的，
    }
}
