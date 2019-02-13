package commonly_used_class;

/**
 * @Author: huangxinjian
 * @Description:   String 的陷阱
 * @Date: Created in 12:19 2019/2/10
 * @Modified By:
 */
public class StringTrap {
    /*
      String使用的陷阱
          String一经初始化后，就不会再改变其内容了。对String字符串的操作实际上是对其副本(原始拷贝)的操作，原来的字符串一点都没有改变。
          比如：  String s ="a"; 创建了一个字符串
                  s = s+"b"; 实际上原来的"a"字符串对象已经丢弃了，现在又产生了另一个字符串s+"b"(也就是"ab")。
            !!如果多次执行这些改变串内容的操作，会导致大量副本字符串对象存留在内存中，降低效率。
            !!如果这样的操作放到循环中，会极大影响程序的时间和空间性能，甚至会造成服务器的崩溃。

          相反，StringBuilder和StringBuffer类是对原字符串本身操作的，可以对字符串进行修改而不产生副本拷贝或者产生少量的副本。
          因此可以在循环中使用。
     */

    public static void main(String[] args) {
        /**使用String进行字符串的拼接*/
        String str8 = "";
        //本质上使用StringBuilder拼接, 但是每次循环都会生成一个StringBuilder对象
        long num1 = Runtime.getRuntime().freeMemory();//获取系统剩余内存空间
        long time1 = System.currentTimeMillis();//获取系统的当前时间
        for (int i = 0; i < 5000; i++) {
            str8 = str8 + i;//相当于产生了10000个对象
        }
        long num2 = Runtime.getRuntime().freeMemory();
        long time2 = System.currentTimeMillis();
        System.out.println("String占用内存 : " + (num1 - num2));
        System.out.println("String占用时间 : " + (time2 - time1));
        /**使用StringBuilder进行字符串的拼接*/
        StringBuilder sb1 = new StringBuilder("");
        long num3 = Runtime.getRuntime().freeMemory();
        long time3 = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            sb1.append(i);
        }
        long num4 = Runtime.getRuntime().freeMemory();
        long time4 = System.currentTimeMillis();
        System.out.println("StringBuilder占用内存 : " + (num3 - num4));
        System.out.println("StringBuilder占用时间 : " + (time4 - time3));
    }
}
