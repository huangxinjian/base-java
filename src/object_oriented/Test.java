package object_oriented;

/**
 * @Author: huangxinjian
 * @Description:  作业
 * @Date: Created in 14:36 2019/1/30
 * @Modified By:
 */
public class Test {
//    int x, y;
//    Test(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//    public static void main(String[] args) {
//        Test pt1, pt2;
//        pt1 = new Test(3, 3);
//        pt2 = new Test(4, 4);
//        System.out.print(pt1.x + pt2.x);
//    }  输出 7

    int count=9;
    public void count1(){
        count=10;
        System.out.print("count1="+count);
    }
    public void count2(){
        System.out.print("count2="+count);
    }
    public static void main(String[ ] args) {
        Test t=new Test();
        t.count1();
        t.count2();
    }
}
