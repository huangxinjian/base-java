package object_oriented;

/**
 * @Author: huangxinjian
 * @Description:  static 关键字
 * @Date: Created in 11:50 2019/1/30
 * @Modified By:
 */
public class TestStatic {

    int id;
    String name;
    String pwd;
    static String company = "sss有限";

    public TestStatic(int id, String name) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    public void login(){
        printCompany(); //非静态中可以调用静态
        System.out.println("登录"+name);
    }

    public static void printCompany(){
        //login() 调用非静态成员方法，编译报错
        System.out.println("公司:"+company);
    }

    public static void main(String[] args) {

        TestStatic testStatic = new TestStatic(1,"Mike");
        testStatic.login();

        TestStatic.printCompany();
    }
}
