
/*
WAJP to reverse 1st half and 2nd half elements of array.
Q:17
Original array  :    10   20  30   40  50  60  70
Reversed array  :    40  30  20   10  70  60  50

 */


public class Q_17 {

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 60, 70};

        System.out.print("Original Array : ");
        for(int x : a) {
            System.out.print(x+" ");
        }


        reverseArray(a,0,a.length/2);
        System.out.print("\nReversed Array 1st half : ");
        for(int x : a) {
            System.out.print(x+" ");
        }



        System.out.print("\n==================================================");

        reverseArray(a,a.length/2+1, a.length-1);
        System.out.print("\nReversed Array 2nd half : ");
        for(int x : a) {
            System.out.print(x+" ");
        }

    }

    public static void reverseArray(int [] a, int start, int end) {

      while (start<end){
          int temp = a[start];
          a[start] = a[end];
          a[end] = temp;

          start++;       end--;
      }
    }









}
