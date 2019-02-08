package arrays;

import java.util.Arrays;

/**
 * @Author: huangxinjian
 * @Description: 冒泡排序
 * @Date: Created in 17:30 2019/2/7
 * @Modified By:
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] a = {9,5,1,3,4,7,6,12,8,22,66,0,77,34};
        /*
        5 1 3 4 7 6 9 12 8 22 66 0 77 34
        1 3 4 5 7 6 9 12 8 22 66 0 77 34

        冒泡排序
         */
        for (int i = 0 ; i < a.length - 1 ; i++){
            boolean flag = true;  //优化
            for (int j = 0 ; j < a.length-1-i ;j++){
                if (a[j] > a[j+1]){
                    a[j] = a[j] + a[j+1];
                    a[j+1] = a[j] - a[j+1];
                    a[j] = a[j] - a[j+1];
                    flag = false;
                }

                System.out.println(Arrays.toString(a));
            }
            if (flag){
                break;
            }
            System.out.println("#########################");
        }

    }
}
