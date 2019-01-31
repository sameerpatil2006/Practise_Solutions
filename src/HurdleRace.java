public class HurdleRace {

    static int hurdleRace(int k, int[] height) {
        int result = 0;
    for (int i =0 ; i<height.length;i++){
        int res = (height[i] - k);
        if (result < res){
            result = res;
        }
    }
        return result;
    }

    public static void main (String args[]){
        int k =4;
        int [] height =  {1,6,3,5,2};
        int result = hurdleRace(k,height);
        System.out.println(result);
    }
}
