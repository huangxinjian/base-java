package container.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: huangxinjian
 * @Description:  HashMap支持null键和null值
 * @Date: Created in 17:17 2019/2/19
 * @Modified By:
 */
public class TestHashMap2 {

    public static void main(String[] args) {

        HashMap<String, Integer> hs = new HashMap<String, Integer>();
        hs.put("一", 1);
        hs.put("二", 2);
        hs.put("三", null);
        hs.put(null, null);

        // 都可以存取null，所以不可以通过ge()返回值来判断键是否为null
        System.out.println(hs.get("三"));
        System.out.println(hs.get(null));



        Employee employee = new Employee(1001,"黄欣健",5000);
        Employee employee2 = new Employee(1002,"黄健",500);
        Employee employee3 = new Employee(1003,"黄欣",50);

        Map<Integer,Employee> map = new HashMap<>();
        map.put(1001,employee);
        map.put(1002,employee2);
        map.put(1003,employee3);

        System.out.println(map);
    }

}

class Employee{

    private int id;
    private String name;
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
