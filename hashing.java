import java.util.*;

public class MyClass {
    public static void main(String args[]) {
      int[] arr = {0,0,0};
      int n = arr.length;
      System.out.println(result(arr, 2, n));
    }
    
    private static int result(int[] arr, Integer k, Integer n) {
        Map<Integer, Integer> left = new HashMap<>();
        Map<Integer, Integer> right = new HashMap<>();
        
        // create right frequency map
        int ans = 0;
        for(int i = 0; i < n; i++) {
            if(right.get(arr[i]) != null) {
                right.put(arr[i], right.get(arr[i])+1);
            }
            else {
                right.put(arr[i], 1);
            }
            
        }
        // 
        for(int i = 0; i < n; i++) {
        // decrement element from right map
            if(right.get(arr[i]) != null) {
                right.put(arr[i], right.get(arr[i])-1);
            }
            
            
        // res += map(element/k in left ) + map(element * k in right)  
        if(left.get(arr[i]/k) != null && right.get(arr[i]*k) != null) {
             ans += left.get(arr[i]/k) * right.get(arr[i]*k);
        }
           
            
            
        
        // increment element from left map 
        
        if(left.get(arr[i]) != null) {
                left.put(arr[i], left.get(arr[i])+1);
            } else {
                left.put(arr[i], 1);
            }
        }
        return ans;
    }
}