public class BeautifulDays {

    static int beautifulDays(int i, int j, int k) {
        int num=0, last =0, rev=0, count=0, sub=0;
        double day;
        while(i<=j){
            num=i;
            rev = 0;
            while (num !=0){
                last = num % 10;
                rev = rev * 10 + last;
                num = num / 10;
            }
            sub = Math.abs(rev-i);

            if (sub % k == 0 ){
                count++;
            }
            i++;
        }
return count;

    }

    public static void main (String args[]){

        int i = 20;
        int j = 23;
        int k = 6;

        int res = beautifulDays(i,j,k);
        System.out.println(res);

    }
}
