package arrays;

import java.util.Arrays;

/**
 * @Author: huangxinjian
 * @Description:  测试数组的拷贝
 * @Date: Created in 15:08 2019/2/7
 * @Modified By:
 */
public class TestArrayCopy {

    public static void main(String[] args) {
        testBasicCopy();

    }

    public static void testBasicCopy(){
        int[] a = new int[3];
        int[] b = {1,5,3};
        /**
         *  srcPos: 原数组的起始拷贝位置
         *  destPos：目标数组的起始存放位置
         *  length：拷贝多少长度的数据
         */
        System.arraycopy(b,0,a,0,1);


        /**
         * public static int[] copyOf(int[] original, int newLength) {
         *         int[] copy = new int[newLength];
         *         System.arraycopy(original, 0, copy, 0,
         *                          Math.min(original.length, newLength));
         *         return copy;
         *     }
         *
         *     copyOf 的底层实现
         */
        b = Arrays.copyOf(b,5);  //数组扩容

        for (int i: b) {
            System.out.print(i+" ");
        }
    }

    public static void testBasicCopy2(){

        int[] b = {1,5,3,4,8,6};
         //删除数组中的元素,例如要删除3 4
        System.arraycopy(b,4,b,2,2);
        System.arraycopy(b,4,b,2,2);

        for (int i: b) {
            System.out.print(i+" ");
        }
    }
}
