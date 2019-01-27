package controlstatement;

/**
 * @Author: huangxinjian
 * @Description: switch 多选择结构
 * @Date: Created in 10:54 2019/1/27
 * @Modified By:
 */
public class TestSwitch {

    public static void main(String[] args) {

    /*
    使用 switch 语句一定要记得break
            注意，switch中的表达式 在  JDK1.5之前必须是 整数(long类型除外) 或者 枚举，不能是字符串
                                  在  JDK1.7之后可以是 字符串
                  如果没有一个结果匹配，则自动进入 default分支
     */

    int i = (int)(6*Math.random()+1);

    switch (i){
        case 1:
            System.out.println(1);
            break;
        case 2:
            System.out.println(2);
            break;
        case 3:
            System.out.println(3);
            break;
        case 4:
            System.out.println(4);
            break;
        case 5:
            System.out.println(5);
            break;
        case 6:
            System.out.println(6);
            break;
        default:
            System.out.println("莫得");
            break;
    }
    }
}
