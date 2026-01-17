
/*
WAJP to print Biggest and second biggest element of the array.
int[] a= {80, 80, 43, 50, 38, 63, 58, 80};
o/p
80
        63

 */



public class Q_45 {
    public static void main(String[] args) {
        int[] a= {80, 80, 43, 50, 38, 63, 58, 80};
//       int result = getSecondBiggest(a);
//        System.out.println(result);
        getSecondBiggest(a);
    }

    public static void getSecondBiggest(int []a){
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for (int x : a){
            if (x>max){
                secondMax=max;
                max=x;
            }
            else if (x>secondMax && x!=max){
                secondMax=x;
            }
        }
        System.out.println(max);
        System.out.println(secondMax);
//        return secondMax;
    }
}