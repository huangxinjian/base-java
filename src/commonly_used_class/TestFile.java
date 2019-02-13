package commonly_used_class;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * @Author: huangxinjian
 * @Description: File类，属于 IO流
 * @Date: Created in 16:19 2019/2/13
 * @Modified By:
 */
public class TestFile {
    /*
    java.io.File 类：代表了我们的  文件 和 目录

        在开发中，读取文件、生成文件、删除文件、修改文件的属性都会用到本类

        File类常用构造函数 public File(String pathname)
            其中 pathname 为我们文件的路径，以 pathname 为路径创建我们的File对象，
                如果pathname是相对路径，则默认的当前路径在系统属性 user.dir 中存储
     */
    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir"));
        File file = new File("a.txt");  //相对路径：默认放到user.dir(即我们的项目根路径)目录下面
        file.createNewFile();   //创建文件
        File f2 = new File("d:/b.txt");  //绝对路径
        File f3 = new File("d:\\b.txt");//我们也可以使用 反斜杠，但是需要转义
        f2.createNewFile();  //在d盘下创建 b.txt
        f2.renameTo(new File("d:/aa.txt"));  //对文件进行改名操作


        /*
        File类之 通过File对象可以访问文件的属性的 常用方法：
            public boolean exists()             判断File是否存在
            public boolean isDirectory()        判断File是否是目录
            public boolean isFile()             判断File是否是文件
            public long lastModified()          返回File最后修改时间
            public long length()                返回File的大小
            public String getName()             返回文件名
            public String getPath()             返回文件的相对路径
            public String getAbsolutePath()     返回文件的绝对路径
         */
        File f = new File("d:/b.txt");
        System.out.println("File是否存在："+f.exists());
        System.out.println("File是否是目录："+f.isDirectory());
        System.out.println("File是否是文件："+f.isFile());
        System.out.println("File最后修改时间："+new Date(f.lastModified()));
        System.out.println("File的大小："+f.length());
        System.out.println("File的文件名："+f.getName());
        System.out.println("File的目录路径："+f.getPath());

        /*
        File类之 通过File对象 创建空文件或目录(在该对象所指的文件或目录不存在的情况下)的常用方法：

              createFile()      创建新的File
              delete()          删除File对应的文件
              mkdir()           创建一个目录；中间某个目录缺失，则创建失败
              mkdirs()          创建多个目录；中间某个目录缺失，则创建该缺失目录
         */

        File f1 = new File("d:/c.txt");
        f1.createNewFile(); // 会在d盘下面生成c.txt文件
        f1.delete(); // 将该文件或目录从硬盘上删除

        /*
        使用 mkdir
         */
        File f4 = new File("d:/电影/华语/大陆");
        boolean flag = f4.mkdir(); //目录结构中有一个不存在，则不会创建整个目录树
        System.out.println(flag);//创建失败

        /*
        使用mkdirs
         */
        File f5 = new File("d:/电影/华语/大陆");
        boolean flag1 = f5.mkdirs();//目录结构中有一个不存在也没关系；创建整个目录树
        System.out.println(flag1);//创建成功
    }
}
