package datetype_operator.billiardsGame01;

import java.awt.*;
import javax.swing.*;

/**
 * @Author: huangxinjian
 * @Description:
 * @Date: Created in 0:35 2019/1/25
 * @Modified By:
 */
public class BallGame extends JFrame{

    Image ball = Toolkit.getDefaultToolkit().createImage("images/billiards_Image01/ball.png");
    Image table = Toolkit.getDefaultToolkit().createImage("images/billiards_Image01/table.jpg");
    double x = 100;
    double y= 100;
    boolean right = true; //小球往右走的控制变量

    public void paint(Graphics g){
        System.out.println("窗口被画了一次");
        g.drawImage(table,0,0,null);
        g.drawImage(ball,(int)x,(int)y,null);

        if (right){  //向右走，直到桌面就弹回来
            x+=10;  //窗口不断被渲染，小球位置不断改变
        }else{
            x-=10;
        }

        if (x >= 856-40-30){
            right = false;
        }else if (x <= 30){
            right=true;
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
        BallGame ballGame = new BallGame();
        ballGame.launchFrame();
    }
}
