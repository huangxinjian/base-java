package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author: huangxinjian
 * @Description: 二分查找发
 * @Date: Created in 12:02 2019/2/8
 * @Modified By:
 */
public class TestBinarySearch {


    public static void main(String[] args) {

        int[] arr = {0,5,7,6,3,55,4,8,9,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(myBinarySearch(55,arr));
    }

    public static int myBinarySearch(int value,int[] arr){

        int low = 0;
        int high =  arr.length-1;

        while (low <= high){

            int mid = (low + high)/2;
            if (value == arr[mid]){
                return mid;
            }
            else if (value > arr[mid]){
                low = mid + 1;
            }else if(value < arr[mid]){
                high = mid - 1;
            }
        }
        return  -1;
    }
}
