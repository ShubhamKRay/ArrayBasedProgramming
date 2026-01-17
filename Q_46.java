
/*
WAJP to print Smallest and second Smallest element of the array.
int[] a= {80, 80, 43, 50, 38, 63, 58, 80};
o/p
38
43
 */


public class Q_46 {
    public static void main(String[] args) {
        int a [] = {80, 80, 43, 50, 38, 63, 58, 80};
//       int result = getSecondSmallest(a);
//        System.out.println(result);
        getSecondSmallest(a);
    }


    public static void getSecondSmallest(int [] a){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int x : a){
            if (x<smallest){
                secondSmallest=smallest;
                smallest=x;
            }
            else if (x<secondSmallest && x!=smallest)
                secondSmallest=x;
        }
//        if (secondSmallest!=Integer.MAX_VALUE)
//            return secondSmallest;

//        else
//            return smallest;

        System.out.println(smallest);
        System.out.println(secondSmallest);
    }
}