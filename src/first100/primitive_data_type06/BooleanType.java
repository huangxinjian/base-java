package first100.primitive_data_type06;

/**
 * @Author: huangxinjian
 * @Description: 布尔类型
 * @Date: Created in 22:20 2019/1/25
 * @Modified By:
 */
public class BooleanType {

    /*
    注意，布尔类型在内存中占用的位数是 一位，因此不能用 0 或 1 来代替 false 和 true(C语言 可以)
     */



    public static void main(String[] args) {
        boolean man = true;
        if(man){   //注意，不推荐写 man==true,容易写成 man =true
            System.out.println("男的");
        }

    }
}
