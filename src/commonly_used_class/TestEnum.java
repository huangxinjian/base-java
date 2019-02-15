package commonly_used_class;

/**
 * @Author: huangxinjian
 * @Description:  测试枚举
 * @Date: Created in 18:30 2019/2/13
 * @Modified By:
 */
public class TestEnum {

    /*
    当我们需要使用一组常量的时候，我们可以使用枚举

    枚举的格式如下：
            enum 枚举名{
                枚举体(常量列表)
            }

            枚举体就是一系列常量，例如下面的例子
            enum Season{
                SPRING,SUMMER,AUTUMN,WINTER
            }

         所有枚举都隐形继承 java.lang.Enum.枚举实质上还是类，而每个枚举的成员实质就是 一个枚举类型的实例（即new出来的对象而已）
            它们默认都是 public static final 修饰的，可以直接通过枚举类型名使用它们。
     */

    public static void main(String[] args) {

        System.out.println(Season.SPRING);

        Season a = Season.AUTUMN;

        switch(a){
            case SPRING:
                System.out.println("春天来了！");
                break;
            case SUMMER:
                System.out.println("夏天来了");
                break;
            case AUTUMN:
                System.out.println("秋天来了");
                break;
            case WINTER:
                System.out.println("冬天来了");
                break;

        }
    }

}

/**
 * 枚举类型
 */
enum Season{
    SPRING,SUMMER,AUTUMN,WINTER
}
