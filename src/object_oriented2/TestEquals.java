package object_oriented2;

/**
 * @Author: huangxinjian
 * @Description: == 和 equal 的区别
 * @Date: Created in 16:25 2019/1/30
 * @Modified By:
 */

public class TestEquals {
     /*
== 用来比较两边的值是否相等,有以下两种情况：
        1. 如果是基本类型，则比较 值是否相等
        2. 如果是引用类型，则比较 地址是否相同

        equal 则只比较值，不比较地址，而且只能用于引用类型
 */

    public static void main(String[] args) {
        Person2 p1 = new Person2(123,"黄欣健1");
        Person2 p2 = new Person2(123,"黄欣健2");
        System.out.println(p1==p2);     //false，不是同一个对象
        System.out.println(p1.equals(p2));  //true，id相同则认为两个对象内容相同
        String s1 = new String("黄欣健");
        String s2 = new String("黄欣健");
        System.out.println(s1==s2);         //false, 两个字符串不是同一个对象
        System.out.println(s1.equals(s2));  //true,  两个字符串内容相同
    }
}
class Person2 {
    int id;
    String name;
    public Person2(int id,String name) {
        this.id=id;
        this.name=name;
    }
    public boolean equals(Object obj) { //重写equal方法
        if(obj == null){
            return false;
        }else {
            if(obj instanceof Person2) {
                Person2 c = (Person2)obj;
                if(c.id==this.id) {
                    return true;
                }
            }
        }
        return false;
    }
}

