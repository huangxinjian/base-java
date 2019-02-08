package arrays;

import java.util.Arrays;

/**
 * @Author: huangxinjian
 * @Description:  Arrays工具类
 * @Date: Created in 17:04 2019/2/7
 * @Modified By:
 */
public class TestArrays {

    public static void main(String[] args) {
        int[] a = {1,10,5,7,6,8,9,2,3,4};

//        System.out.println(a); //这样子打印只会出现 hash码
//        System.out.println(Arrays.toString(a)); //这样打印才是正确打印值，可以替换 foreach


        // 基本类型排序
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        //如果是引用类型数组进行排序，需要 实现 Comparable接口，并重写 compareTo 方法


        //二分查找法，查询 某数组里面的某个值的索引位置，如果不存在，返回 -1

        //使用二分法查找，必须先对数组进行排序;
        System.out.println(Arrays.binarySearch(a,7));

        //数组填充
        int[] b= {1,2,323,23,543,12,59};
        System.out.println(Arrays.toString(a));
        Arrays.fill(b, 2, 4, 100);  //将2到4索引的元素替换为100;
        System.out.println(Arrays.toString(b));
    }
}
