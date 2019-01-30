package object_oriented;

import static java.lang.Math.PI;

/**
 * @Author: huangxinjian
 * @Description:  JDK1.5新功能， 静态导入
 * @Date: Created in 14:33 2019/1/30
 * @Modified By:
 */
public class StaticImport {

    public static void main(String[] args) {

//        System.out.println(Math.PI);  //平常我们需要这样使用
        System.out.println(PI);  //导入static后，可以这样使用
    }
}
