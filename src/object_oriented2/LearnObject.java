package object_oriented2;

/**
 * @Author: huangxinjian
 * @Description: 学习 Object类,native关键字需要调用本地操作系统的内容，不是由java实现的
 * @Date: Created in 16:05 2019/1/30
 * @Modified By:
 */
public class LearnObject {

    public static void main(String[] args) {
        LearnObject l = new LearnObject();
    }

    //重写 toString

    @Override
    public String toString() {
        return "LearnObject{}";
    }
}
