public class UtopianTree {

    static int utopianTree(int n) {

        int h = 1;

        for(int i = 1 ; i <= n ; i++)
        {
            if(i % 2 != 0)
                h *= 2;
            else
                h +=1 ;
        }

        return h;

    }

    public static void main(String [] args){

       int result =  utopianTree(3);
        System.out.println(result);


    }
}
