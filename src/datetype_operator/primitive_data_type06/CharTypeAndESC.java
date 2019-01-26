package datetype_operator.primitive_data_type06;

/**
 * @Author: huangxinjian
 * @Description:  字符型变量/常量 和 转义字符
 * @Date: Created in 21:59 2019/1/25
 * @Modified By:
 */
public class CharTypeAndESC {

    /*
    char在java种表示字符型，它只占用两个字节，通常使用单引号 '' 来表示字符常量

    char字符型通常用来表示 Unicode 编码表中的字符，一共有 65536 个字符，
     */
    public static void main(String[] args) {

        // Unicode具有从0到65536之间的编码，它们通常由 '\u0000' 到 '\uFFFF' 的十六进制值来表示（u表示Unicode）
        char a = 't';
        char b = '黄';

        char c = '\u0064';

        /*
        注意：在JAVA中，还可以使用 \ 来进行转义一些特殊字符

               转义符          含义              Unicode 值
               \b          退格 backspce          \u0008
               \n              换行               \u000a
               \r              回车               \u000d
               \t            制表符(tab)          \u0009
               \"            双引号               \u0022
               \'            单引号               \u0027
               \\            反斜杠               \u005c
         */
        char c1 = '\n';
        System.out.println(""+ 'a' + '\n' + 'b');
        System.out.println(""+ 'a' + '\t' + 'b');
        System.out.println(""+ 'a' + '\r' + 'b'); //回车，在当前行内
        System.out.println(""+ 'a' + '\b' + 'b'); //退一格把a抵消了
        System.out.println(""+ 'a' + '\'' + 'b');

//        String 其实就是字符序列，是由一列字符组成的，类似数组
    }
}
