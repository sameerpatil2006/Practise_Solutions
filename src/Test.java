import java.util.*;
public class Test {

    public static void main (String[] args){
        System.out.println("");
        Test t1 = new Test();
        System.out.println(t1.Solution("aaccdd"));

    }

        String Solution (String S){
            int[] occurences = new int[26];
            for (char ch : S.toCharArray()){
                System.out.print(ch + " - ");
                System.out.println((int) ch);
                occurences[ch - 'a']++;
            }

            char best_char = 'a';
            int best_res = 0;

            for (int i=0; i<26;i++){
                if (occurences[i] > best_res){
                    best_char = (char)((int)'a' + i);
                    best_res = occurences[i];
                }
            }
            return Character.toString(best_char);
        }
    }

