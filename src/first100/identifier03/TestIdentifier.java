package first100.identifier03;

/**
 * @Author: huangxinjian
 * @Description: 标识符的使用
 * @Date: Created in 19:36 2019/1/25
 * @Modified By:
 */
public class TestIdentifier {

    public static void main(String[] args){

        /*
        标识符只能由 英文 数字 下划线 _ 和 美元符号 $ 组成
        而且不能由数字开头

        这里的英文并不局限于 a-z的英文字母，而是 Unicode 字符集中的字符
         */
        int a123 = 1;
        int _a123 = 1;
        int $A = 2;

//        int 123a = 2 ; 这样会报错，因为不能用数字开头
        int 变量1 = 2; // 这样也是可以的，因为中文也在 Unicode 字符集中。
     }
}
