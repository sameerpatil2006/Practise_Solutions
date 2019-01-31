public class Palindrome {

    public static void main (String [] args) {
        String str = "MADAM";
        boolean flag = false;
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
          if (str.charAt(i) == str.charAt(j))
              flag = true;
          else {
              flag = false;
          }
          i++;
          j--;
        }

        System.out.println(flag);
    }
}
