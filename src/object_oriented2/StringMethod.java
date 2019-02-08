package object_oriented2;

/**
 * @Author: huangxinjian
 * @Description:    String类常用方法
 * @Date: Created in 14:33 2019/2/7
 * @Modified By:
 */
public class StringMethod {

    public static void main(String[] args) {

        String str1 = "core java";
        String str2 = "Core java";

        System.out.println(str1.charAt(3));  //提取下标为3的字符，返回一个char字符

        System.out.println(str2.length());   //获取字符串的长度

        System.out.println(str1.equals(str2));  //比较两个字符串是否相等
        System.out.println(str1.equalsIgnoreCase(str2)); //比较两个字符串是否相等（在忽略大小写的情况下）。这里输出 true

        System.out.println(str1.indexOf("java")); //查看str1这字符串中是否包含参数中的字符串，返回第一个匹配到的位置
        System.out.println(str1.indexOf("apple")); //不存在就返回 -1

        String s  = str1.replace(" ","&"); //注意：这里直接返回一个新的字符串，str1没有任何变化


        String str3 = "";
        String str4 = "how are you?";

        System.out.println(str4.startsWith("how")); //是否以 “how”开头
        System.out.println(str4.endsWith("you")); //是否以 “you”结尾

        str3 = str4.substring(4); //把索引4后面所有的字符串截取
        System.out.println(str3);
        str3 = str4.substring(4,7); //把索引 [4,7) 之间的字符串截取
        System.out.println(str3);

        System.out.println(str4.toLowerCase()); //转全小写
        System.out.println(str4.toUpperCase()); //转全大写

        str4.trim(); //去除首尾全部空格。中间的不去

    }
}
