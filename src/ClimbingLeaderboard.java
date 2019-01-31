import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClimbingLeaderboard {
    public static void main (String args[]){
        int [] scores = {100,100,50,40,40,20,10};
        int [] alice = {5,65,77,90,102};
        int [] result;
        result = climbingLeaderboard(scores, alice);
        System.out.println(result);
    }

    public static int[] climbingLeaderboard(int[] scores, int[] alice){

        List<Integer> rankList = new ArrayList<>();
        int [] result = new int[alice.length];

        int x = 0;
        int y = 1;

        while (y < scores.length) {
            if (scores[y] == scores[x]) {
                y++;
            } else {
                x++;
                scores[x] = scores[y];
                y++;
            }
        }
        int[] scores1 = Arrays.copyOf(scores, x + 1);
        for (int i= 0; i<scores1.length;i++){
            System.out.println(scores1[i]);
        }

        //int [] scores = {100,100,50,40,40,20,10};
        //int [] alice = {5,65,77,90,102};

        for (int i=0; i<alice.length;i++){
            for (int j=0; j<scores1.length;j++){

                if (alice[i] >= scores1[j]){
                    result[i] = j+1;
                    //rankList.add(j+1);
                    break;
                }
                /*else if (alice[i]<scores1[j] && alice[i] > scores1 [j+1]){
                    rankList.add(j+1);
                    break;
                }*/
                else if (alice[i]>scores1[j] && alice[i] < scores1 [j-1]){
                    result[i] = j+1;
                    //rankList.add(j+1);
                    break;
                }
                else if (alice[i] < scores1[j] && j == scores1.length-1){
                    result[i] = j+2;
                    //rankList.add(j+2);
                    break;
                }
            }
        }


        return result;
    }
}
