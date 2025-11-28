public class Q_5 {

    public static void main(String[] args) {
//		For the given array of Strings, print and count all the Strings
//		which has even number of characters.

        String [] str = {"abc", "xyzp", "pqrsqu", "daaa"};
        printEvenSizedString(str);

    }
    public static void printEvenSizedString(String [] str) {
        int count = 0;
        for(String s : str) {
            if(s.length()%2==0) {
                System.out.println(s);
                count++;
            }
        }
        System.out.println("Total such Strings are : "+count);


    }

}
