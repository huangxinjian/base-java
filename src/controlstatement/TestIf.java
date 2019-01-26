package controlstatement;

/**
 * @Author: huangxinjian
 * @Description:  if单选择结构
 * @Date: Created in 23:48 2019/1/26
 * @Modified By:
 */
public class TestIf {

    public static void main(String[] args) {

        int i = (int)((6*Math.random())+1);  // Math.random() 生成 [0,1) 之间的随机数
        //单if选择
        System.out.println(i);
        if (i > 5){
            System.out.println("手气不错!");
        }
    }

}
