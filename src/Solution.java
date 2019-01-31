import java.io.*;
import java.util.*;
import java.util.HashMap.*;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        int value, newValue, count = 0, entryValue;
        for (int i = 0; i < n; i++) {
            if (hmap.containsKey(ar[i])) {
                System.out.println(ar[i]);
                value = hmap.get(ar[i]);
                newValue = value + 1;
                hmap.put(ar[i], newValue);
            } else {
                hmap.put(ar[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> abc : hmap.entrySet()) {
            entryValue = abc.getValue();
            if (abc.getValue() != 0) {
                count = count + ((entryValue) / 2);
            }
        }
        return count;
    }


    public static void main(String[] args) throws IOException {


        int n = 9;
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};


        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
