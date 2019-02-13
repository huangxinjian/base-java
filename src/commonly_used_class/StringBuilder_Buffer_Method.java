package commonly_used_class;

/**
 * @Author: huangxinjian
 * @Description:  StringBuilder 和 StringBuffer方法
 * @Date: Created in 11:35 2019/2/10
 * @Modified By:
 */
public class StringBuilder_Buffer_Method {

    /*
     String类的常用方法，sBuilder 和 sBuffer 都有
     */
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        // 追加方法  append 在原本字符序列后追加指定的字符序列
        for (int i = 0 ; i < 26 ; i++){
            char temp = (char)('a'+i);
            sb.append(temp);
        }
        System.out.println(sb);  // 输出 abcdefghijklmnopqrstuvwxyz

        sb.reverse();   //把字符串倒序
        System.out.println(sb);  // 输出 zyxwvutsrqponmlkjihgfedcba


        //修改某个索引的值
        sb.setCharAt(3,'黄');
        System.out.println(sb);

        //在指定位置插入一个字符或字符串
        /*
        由于 insert 方法的源码是 return this,因此我们可以 链式调用 insert 函数
         */
        sb.insert(0,"我").insert(1,'你').insert(2,'她');
        System.out.println(sb);

        /*
        delete函数返回的也是 this，因此我们也可以进行 链式调用
         */
        sb.delete(0,2);  //删除某个区间之间的字符，注意是 [start,end - 1]
        System.out.println(sb);
        sb.deleteCharAt(0);  //删除某个索引的字符
        System.out.println(sb);
    }
}
