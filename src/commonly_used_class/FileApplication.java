package commonly_used_class;

import java.io.File;
import java.io.IOException;

/**
 * @Author: huangxinjian
 * @Description: File类的小应用
 * @Date: Created in 17:21 2019/2/13
 * @Modified By:
 */
public class FileApplication {

    public static void main(String[] args) throws IOException {

        //指定一个文件
        File file = new File("d:/sxt/b.txt");  //在d盘下的sxt目录下的b.txt文件
        //判断该文件是否存在
        boolean flag = file.exists();
        //如果存在就删除，不存在就创建
        if (flag) {
            boolean flag1 = file.delete();
            System.out.println(flag1 ? "删除成功" : "删除失败");
        } else {
            boolean flag2 = true;
            try {
                //如果目录不存在，先创建目录
                File dir = file.getParentFile();  //看看能否获取到 sxt 的File对象
                dir.mkdirs();
                //创建文件
                flag2 = file.createNewFile();
                System.out.println("创建成功");
            } catch (IOException e) {
                System.out.println("创建失败");
                e.printStackTrace();
            }
        }
    }
}
