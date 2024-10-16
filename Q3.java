import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 1};
        Map<Integer,Integer> duplicates=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int cnt=duplicates.getOrDefault(arr[i], 0);
            duplicates.put(arr[i],cnt+1);
        }
        boolean flag=false;
        for(Map.Entry<Integer,Integer> e:duplicates.entrySet()){
            if(e.getValue()!=1){
                System.out.println(e.getKey());
                flag=true;
            }
        }
        if(flag){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
