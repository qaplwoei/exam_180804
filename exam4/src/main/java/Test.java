import java.lang.reflect.Array;
import java.util.*;

public class Test {
    public static final int MAX_COUNT=50;
    public static void main(String[] args) {
        int[] arr=new int[MAX_COUNT];
        Random random=new Random();
        for (int i = 0; i < MAX_COUNT; i++) {
            arr[i]=random.nextInt(100);
        }
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if(i!=arr.length-1)
                sb.append(",");
        }
        System.out.println("随机生成50个小于100的数,分别为:"+sb.toString());
        Map<Integer,ArrayList<Integer>> map=new HashMap<Integer,ArrayList<Integer>>();
        for (int i = 0; i < arr.length; i++) {
            int key=arr[i]/10;
            if(map.containsKey(key))
                map.get(key).add(arr[i]);
            else {
                ArrayList<Integer> arrayList=new ArrayList<Integer>();
                arrayList.add(arr[i]);
                map.put(arr[i]/10,arrayList);
            }
        }
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        sb1.append("Map中的数据为: {");
        sb2.append("排序后的Map为: {");
        for (Map.Entry<Integer,ArrayList<Integer>> item : map.entrySet()) {
            sb1.append(item.getKey()+"=>");
            sb1.append(item.getValue());
            sb1.append(",");
            Collections.sort(item.getValue());
            sb2.append(item.getKey()+"=>");
            sb2.append(item.getValue());
            sb2.append(",");
        }
        sb1.delete(sb1.length()-1,sb1.length());
        sb1.append("}");
        sb2.delete(sb2.length()-1,sb2.length());
        sb2.append("}");
        System.out.println(sb1.toString());
        System.out.println(sb2.toString());
    }
}
