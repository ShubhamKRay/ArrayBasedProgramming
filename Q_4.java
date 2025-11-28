

//  For the given array of Strings, print the largest string.


public class Q_4 {

    public static void main(String[] args) {
        String []str = {"abc", "xyzp", "pqrstu", "aaa"};
        String big= getBiggestString(str);
        System.out.println(big);
    }

    public static String getBiggestString(String [] str) {
        String big = str[0];
        for(String s : str) {
            if(s.length()>big.length())
                big = s;
        }
        return big;
    }



















}
