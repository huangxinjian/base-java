package exception;

/**
 * @Author: huangxinjian
 * @Description: 自定义异常
 * @Date: Created in 19:35 2019/2/15
 * @Modified By:
 */
public class CustomException {
    /*
        我们平时在写程序的时候，可能会遇到 JDK 提供的任何标准异常类都无法充分描述清楚我们想表达的问题
     这样就可以使用 自定义异常 来解决。

        自定义异常的要点
            1. 自定义异常类只需要从Exception类或它的子类派生出一个子类即可
            2. 自定义异常如果继承 Exception 类，则为 CheckedException（必须在编译时处理）
               自定义异常如果继承 RuntimeException，则为运行时异常，不需要马上处理

        注意事项：
            习惯上，自定义异常应该包含两个构造器，一个是默认的构造器，一个是带有详细信息的构造器

     */

    public static void main(String[] args) {

        Person p = new Person();
        p.setAge(1);  // 抛出 IllegalAgeException
        p.setUserId(-1);  //抛出 IllegalUserIdException
    }
}


class Person{

    private int age;
    private int userId;

    public void setUserId(int userId)  {
        if (userId<0){
            try {
                throw new IllegalUserIdException("UserId不能为负数");
            } catch (IllegalUserIdException e) {
                e.printStackTrace();
            }
        }
        this.userId = userId;
    }

    public void setAge(int age) {
        if (age<0){
            throw new IllegalAgeException("年龄不能为负数");
        }
        this.age = age;
    }
}

/**
 * 定义一个 自定义运行时异常
 */
class IllegalAgeException extends RuntimeException{

    public IllegalAgeException() {
    }

    public IllegalAgeException(String message) {
        super(message);
    }
}


/**
 * 定义一个 checkedException 编译时异常
 */
class IllegalUserIdException extends Exception{

    public IllegalUserIdException() {
    }

    public IllegalUserIdException(String message) {
        super(message);
    }
}