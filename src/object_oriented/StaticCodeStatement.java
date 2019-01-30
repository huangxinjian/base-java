package object_oriented;

/**
 * @Author: huangxinjian
 * @Description: 静态代码块
 * @Date: Created in 13:44 2019/1/30
 * @Modified By:
 */


class Father{
    String name;

    {
        System.out.println("构造代码块--father");
    }
    static {
        System.out.println("这是爸爸静态static代码块");
    }
    public Father(String name) {
        System.out.println("这是爸爸构造函数");
        this.name = name;
    }


}

class Son extends Father{
    String name;
    {
        System.out.println("构造代码块--son");
    }
    static {
        System.out.println("这是儿子静态static代码块");
    }
    public Son(String name) {
        super(name+"--father");
        this.name = name;
        System.out.println("这是儿子构造代码块");
    }
}


public class StaticCodeStatement {

    static {
        /*
        这就是静态代码块
            特点:
                1.回溯调用，静态代码块的执行顺序是，先执行父类的静态代码块，再执行本类的静态代码块
                2. 构造方法的执行顺序跟静态代码块的执行顺序一样，但是构造块的执行顺序比静态代码慢，静态代码块先执行，构造块后执行
         */
        System.out.println("测试static");
    }

    public static void main(String[] args) {
        /*
            测试static
            这是爸爸静态static代码块
            这是儿子静态static代码块
            构造代码块--father
            这是爸爸构造函数
            构造代码块--son
            这是儿子构造代码块
         */
        Son son = new Son("sss");


        /**
         * 这样只会执行  测试static 的静态代码块，其他不会执行
         */
        Son son1 = null;
    }
}
