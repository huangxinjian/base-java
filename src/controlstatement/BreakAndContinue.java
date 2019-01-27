package controlstatement;

/**
 * @Author: huangxinjian
 * @Description:  break语句和 continue
 * @Date: Created in 15:04 2019/1/27
 * @Modified By:
 */
public class BreakAndContinue {

    /*
    break：用来强行跳出循环，并且不会再执行下面的循环
     */
    public static void main(String[] args) {

        //break演示
        for (int i = 1;i  < 10 ;i++){
            if (i == 5){
                break;
            }
            System.out.print(i+"\t");  //当 i==5的时候，就会执行break，不会再继续打印下去，所以输出 1 2 3 4
        }

        System.out.println();
        //continue
        for (int j =1 ;j <10;j++){
            if (j==5){
                continue;
            }
            System.out.print(j +"\t"); //continue只会跳出当前循环，然后执行后面的 循环，所以会输出1 2 3 4 6 7 8 9
        }
    }
}
