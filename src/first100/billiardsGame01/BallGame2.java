package first100.billiardsGame01;

import javax.swing.*;
import java.awt.*;

/**
 * @Author: huangxinjian
 * @Description:
 * @Date: Created in 0:35 2019/1/25
 * @Modified By:
 */
public class BallGame2 extends JFrame{

    Image ball = Toolkit.getDefaultToolkit().createImage("images/billiards_Image01/ball.png");
    Image table = Toolkit.getDefaultToolkit().createImage("images/billiards_Image01/table.jpg");
    double x = 100;
    double y= 100;
    boolean right = true; //小球往右走的控制变量

    double degree = 3.14/3;  //弧度，这表明是60度

    public void paint(Graphics g){
        System.out.println("窗口被画了一次");
        g.drawImage(table,0,0,null);
        g.drawImage(ball,(int)x,(int)y,null);

        x = x + 10 * Math.cos(degree);
        y = y + 10 * Math.sin(degree);

        if (y >= 500-40-30 || y <= 40+40 ){  //后面的40+40是一个是桌面宽度，一个是边框宽度
            degree = -degree;
        }

        if ( x >= 856-40-30 || x <= 40 ){
            degree = 3.14 - degree;
        }
    }

    public void launchFrame(){
        setSize(856,500); //窗口大小
        setLocation(50,50); //窗口位置
        setVisible(true);

        //要让小球移动，则需要重新渲染窗口
        while(true){
            repaint();
            try {
                Thread.sleep(40); //40毫秒，1秒=1000毫秒，因此1秒重画25次
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String args[]){
        System.out.println("今天是黄欣健第一次复习java基础知识");
        BallGame2 ballGame = new BallGame2();
        ballGame.launchFrame();
    }
}
