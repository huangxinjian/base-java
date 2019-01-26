package first100.type_conversion08;

/**
 * @Author: huangxinjian
 * @Description:  类型转换的分类
 * @Date: Created in 22:57 2019/1/26
 * @Modified By:
 */
public class TypeConversionSort {

    /*
    类型转换一共有两种：
            1. 自动类型转换：自动类型转换指的是容量小的数据类型可以自动转换为容量大的数据类型
                             容量是只 该数据类型的最大范围，而不是字节数
                             因此  long型虽然有8个字节，float只有4个字节，但是float可以表示的范围比long的大
                             因此 long型可以自动转换为 float型,但会精度损失

                                      char
                                        |
                     btye -- short --  int  -- long            其中 int --> float  long-->float
                                        |    X   |                  long --> double 都会损失精度,其余则不会
                                      float -- double

            2. 强制类型转换
     */

    public static void main(String[] args) {

        /*
        自动类型转换:
         */
        float f1 = 314L;
        //long l1 = 3.14f; 这里就会编译报错

        float f2 = 3/2;
        System.out.println(f2);  //结果是 1.0

        float f3 = 3L;
        System.out.println(f3/2L); //结果是 1.5

        //特例
        byte b = 123; // 123虽然是整形常量(int),但是只要不超出byte所能表示的范围,也是可以自动转换的
        //short 也可以
        short s = 20000;

        /*
        强制类型转换
         */
        double x = 3.14;
        int i = (int)x ;
        System.out.println(i); //输出的是3,这里是直接舍弃小数部分,而不是四舍五入

        char c = 'a';
        int i1 = c + 1;
        System.out.println(i1);  //这里输入 98,原因是 操作数中有 int,全部转为int运算
        System.out.println((char)i1);  //强转为char类型
    }
}
