import java.util.ArrayList;
import java.util.List;

public class Binary {

    public static void main(String args[]) {
        int n = 161;
        toBinary(n);
        List<Integer> a = new ArrayList<Integer>();
        a.add(7);


        System.out.println(a);
    }

    public static void toBinary(int n) {

        List<Integer> abc = new ArrayList<Integer>();
        String bin = Integer.toBinaryString(n);
        int count = 0;
        char[] arr;
        arr = bin.toCharArray();
        System.out.println(bin);
        for (int i = 0; i < arr.length; i++) {
            if (bin.charAt(i) == '1') {
                count++;
            }
        }
        abc.add(count);
        for (int i = 0; i < arr.length; i++) {
            if (bin.charAt(i) == '1') {
                abc.add(i+1);
            }
        }
        System.out.println(abc);
    }
}
