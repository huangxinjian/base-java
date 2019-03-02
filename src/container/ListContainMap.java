package container;

import java.sql.Struct;
import java.util.*;

/**
 * @Author: huangxinjian
 * @Description:  结合 List 和Map存储整张表
 * @Date: Created in 11:11 2019/2/28
 * @Modified By:
 */
public class ListContainMap {

    public static void main(String[] args) {

        /**
         *   一行数据对应一个Map
         *   把多个Map存放到 List 中
         */

        Map<String,Object> map = new HashMap<>();
        map.put("name","黄金甲");
        map.put("id",1);
        map.put("age",15);
        Map<String,Object> map2 = new HashMap<>();
        map2.put("name","甲");
        map2.put("id",2);
        map2.put("age",25);
        Map<String,Object> map3 = new HashMap<>();
        map3.put("name","金");
        map3.put("id",3);
        map3.put("age",35);

        List<Map<String,Object>> list = new ArrayList<>();
        list.add(map);
        list.add(map2);
        list.add(map3);

        for (Iterator<Map<String,Object>> iterator = list.iterator();iterator.hasNext();){
            Map<String,Object> row = iterator.next();
            Set<String> set = row.keySet();
            for (Iterator<String> ite = set.iterator();ite.hasNext();){
                String key = ite.next();
                System.out.print(key+":"+row.get(key)+",");
            }
            System.out.println();
        }
    }
}
