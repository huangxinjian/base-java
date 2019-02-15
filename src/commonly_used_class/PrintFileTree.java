package commonly_used_class;

import java.io.File;

/**
 * @Author: huangxinjian
 * @Description: 递归打印目录树
 * @Date: Created in 18:11 2019/2/13
 * @Modified By:
 */
public class PrintFileTree {

    public static void main(String[] args) {

        File file = new File("D:\\Java\\finalDesign");
        printFileTree(file,0);
    }

    /**
     *  遍历输入文件目录树
     * @param file   要递归的文件or文件目录的File对象
     * @param level  层次，0为父目录 1为第一层子目录
     */
    public static void printFileTree(File file,int level){

        //输出层次树
        for (int i = 0;i < level ; i++){
            System.out.print("- ");
        }

        System.out.println(file.getName());
        //判断当前层数是否为目录
        if (file.isDirectory()){
            File[] files = file.listFiles();  //获取当前File对象的所有子File对象
            for (File temp: files) {
                if (!temp.getName().equals("knshare")){  //忽略 knshare 文件夹
                    printFileTree(temp,level+1);
                }
            }
        }
    }
}
