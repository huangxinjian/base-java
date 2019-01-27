package controlstatement;

/**
 * @Author: huangxinjian
 * @Description:
 * @Date: Created in 16:39 2019/1/27
 * @Modified By:
 */
public class Homework {

    public static void main(String[] args) {

        boolean a=true;
        boolean b=false;
        if (!(a&&b)) {
            System.out.print("!(a&&b)");
        }else if (!(a||b)) {
            System.out.println("!(a||b)");
        }else {
            System.out.println("ab");
        }
    }
}
