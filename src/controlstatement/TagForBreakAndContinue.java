package controlstatement;

/**
 * @Author: huangxinjian
 * @Description: 带标签的break和continue
 * @Date: Created in 15:33 2019/1/27
 * @Modified By:
 */
public class TagForBreakAndContinue {

    public static void main(String[] args) {
        outer: for (int i = 101; i < 150; i++) {
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0){
                    continue outer; //跳转到outer代码所在的地方
                }
            }
            System.out.print(i + "  ");
        }
    }
}
