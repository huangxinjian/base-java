package controlstatement;

/**
 * @Author: huangxinjian
 * @Description:  嵌套循环
 * @Date: Created in 11:48 2019/1/27
 * @Modified By:
 */
public class TestNestedLoop {

    /*
    测试嵌套循环
     */
    public static void main(String[] args) {

        /*
        打印 1 1 1 1 1
             2 2 2 2 2
             3 3 3 3 3
             4 4 4 4 4
             5 5 5 5 5
         */
        for (int i = 1 ; i < 6 ; i++){
            for (int j = 0 ; j < 5 ; j++){
                System.out.print(i + "\t");
            }
            System.out.println();
        }

        /*
        打印 99 乘法表
         */
        for (int a = 1 ; a < 10 ; a++){
            for (int b = 1 ; b <= a ; b++){
                System.out.print(b+"*"+a+"="+(a*b<10?(" "+a*b):(a*b)));
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("###################### 逆向99乘法表");
        for (int m = 9 ; m>=1 ; m--) {
            for (int z = 7*(9-m) ; z >=1 ; z--){
                System.out.print(" ");
            }
            for (int n = m; n >= 1; n--) {
                System.out.print(m + "*" + n + "=" + ((n*m<10?(" "+n*m):(n*m))) + " ");
            }

            System.out.println();
        }

        //用while分别计算100以内 奇数和偶数的和
        int count = 100;
        int ouSum = 0;
        int jiSum = 0;
        while (count >= 1){
            if (count %2 ==0){
                ouSum += count;
            }else {
                jiSum += count;
            }
            count --;
        }
        System.out.println("奇数和："+jiSum +"--"+"偶数和:"+ouSum);
    }
}
