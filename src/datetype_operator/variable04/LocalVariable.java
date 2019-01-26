package datetype_operator.variable04;

/**
 * @Author: huangxinjian
 * @Description:  局部变量
 * @Date: Created in 20:45 2019/1/25
 * @Modified By:
 */
public class LocalVariable {

    /*
    局部变量就是 LocalVariable，所有在 方法或语句块中 声明的变量都是局部变量，
        生命周期在定义的位置开始到方法或语句块执行完毕为止
        只在方法中或语句块中才能使用

        局部变量在使用前 必须 ”先声明，然后初始化（赋值）“，才可以使用。
     */

    public static void main(String[] args) {

//    {
//        int age ;
//    }
//
//    age = 18;   这里的age是不能使用的，因为 age 的使用位置已经超出了语句块的范围 { }括起来的地方叫做语句块

        {
            int age;
            age = 18;
        }

//        int i ;
//        int j = i + 3;  这里编译报错就是因为 i 没有初始化就使用，因此局部变量必须先初始化后才能使用

        int i = 3;
        int j = i + 3;
    }


}
