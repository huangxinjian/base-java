package container.set;


import java.util.Set;
import java.util.TreeSet;

/**
 * @Author: huangxinjian
 * @Description:  测试 TreeMap 以及 实现 Comparable 接口
 * @Date: Created in 10:32 2019/2/26
 * @Modified By:
 */
public class TestTreeSet {

    /*
       TreeSet底层使用的也是  简化版的TreeMap，具体跟 HashSet与HashMap差不多

        TreeSet底层实际是用TreeMap实现的，内部维持了一个简化版的TreeMap，通过key来存储Set的元素。
            TreeSet内部需要对存储的元素进行排序，因此，我们对应的类需要实现Comparable接口。
                这样，才能根据compareTo()方法比较对象之间的大小，才能进行内部排序


       使用TreeSet要点：

      (1) 由于是二叉树，需要对元素做内部排序。
             如果要放入TreeSet中的类没有实现Comparable接口，则会抛出异常：java.lang.ClassCastException。

      (2) TreeSet中不能放入null元素。因为 TreeMap不支持 null 键，所以TreeSet中不能存放null值
     */

    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();
        set.add(100);
        set.add(500);
        set.add(200);
        set.add(20);

        for (Integer m: set) {
            /*
                20
                100
                200
                500
                输出的结果会被自动排序
             */
            System.out.println(m);
        }


        Set<Emp2> set2 = new TreeSet<>();
        set2.add(new Emp2(100,"张三",5000));
        set2.add(new Emp2(120,"赵六",8000));
        set2.add(new Emp2(120,"李汉",2000));
        set2.add(new Emp2(50,"李四",50000));
        for (Emp2 m: set2) {
            /*
                20
                100
                200
                500
                输出的结果会被自动排序
             */
            System.out.println(m);
        }

    }

}

class Emp2 implements Comparable<Emp2>{

    int id;
    String name;
    double salary;

    public Emp2(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     * @Description 比较这个对象和指定的传入的对象为了排序
     *
     * 返回一个 负数、0、整数对应这个对象如果小于、等于、大于这个指定的传入的参数
     * @param o
     * @return
     */
    @Override
    public int compareTo(Emp2 o) {  // 负数：小于 0：等于  正数：大于

        if (this.salary > o.salary){
            return  1;
        }else if (this.salary < o.salary){
            return -1;
        }else{  //如果工资相同，比较id
            if (this.id > o.id){
                return 1;
            }else if (this.id < o.id){
                return -1;
            }else{
                return 0;
            }
        }
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

