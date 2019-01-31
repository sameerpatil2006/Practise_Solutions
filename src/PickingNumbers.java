import javax.swing.text.html.HTMLDocument;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class PickingNumbers {

    public static void main(String[] args) throws IOException {

        List<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(2);
        a.add(3);
        a.add(1);
        a.add(2);
        int result = Result.pickingNumbers(a);
        System.out.println(result);

       }
}

class Result {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        //122312
       /* int count = 0;
        int max =0;
        for (int i =0 ; i< a.size(); i++){
            for (int j = 0; j<a.size()-1;j++){
                *//*if ((a.get(i) == a.get(j)) || (Math.abs(a.get(i)-a.get(j+1))== 0)
                        || (Math.abs(a.get(i)-a.get(j+1))== 1) || (Math.abs(a.get(i)-a.get(j-1))== 0)
                        || (Math.abs(a.get(i)-a.get(j-1))== 1)){
                *//*
                if ((a.get(i)== a.get(j)) || Math.abs(a.get(i)- a.get(j)) ==0 || Math.abs(a.get(i)- a.get(j))==1)
                {count++;
                }
            }
            if (max < count){
                max = count;
            }
            count = 0;
        }
        return  max;
*/

        int count =0, max =0, maxcount =0;
        int first = 0 , second = 0;

        HashMap<Integer,Integer> hmap = new HashMap<>();
        for (int i=0; i<a.size();i++){
            if (hmap.containsKey(a.get(i))){
                count = hmap.get(a.get(i));
                count++;
            }
            else {
                count = 1;
            }
            hmap.put(a.get(i),count);
            count = 0;
        }

        for (int i =0; i<a.size(); i++){
            if (hmap.containsKey(a.get(i)-1)){
                first = hmap.get(a.get(i)-1);
                max = first + hmap.get(a.get(i));
            }
            else if (hmap.containsKey(a.get(i)+1)){
                second = hmap.get(a.get(i)+1);
                max = second + hmap.get(a.get(i));
            }
            else {
                max = hmap.get(a.get(i));
            }
            if (maxcount < max){
                maxcount = max;
            }
        }

        return maxcount;


    }

}


