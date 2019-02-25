package container.set.my_custom_hashSet;

import java.util.HashMap;

/**
 * @Author: huangxinjian
 * @Description:  自定义 hashset
 * @Date: Created in 12:31 2019/2/25
 * @Modified By:
 */
public class CustomHashSet {

    public static final Object PRESENT = new Object();
    HashMap map;

    public CustomHashSet() {
        this.map = new HashMap();
    }

    public int size(){
        return map.size();
    }

    public void add(Object o){
        map.put(o,PRESENT);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("[");

        for (Object key:map.keySet()
             ) {
            sb.append(key+",");
        }
        sb.setCharAt(sb.length()-1,']');
        return sb.toString();
    }

    public static void main(String[] args) {
        CustomHashSet set = new CustomHashSet();
        set.add("aa");
        set.add("bb");
        set.add("cc");

        System.out.println(set);
    }

}
