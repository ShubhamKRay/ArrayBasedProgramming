
/*
WAJP to reverse each element of the array.
Original array:   10   20  30   40  50  60  70
Reversed array:    70   60  50   40  30  20  10

 */



public class Q_16 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 60, 70};

        System.out.print("Original Array : ");
        for(int x : a) {
            System.out.print(x+" ");
        }

        reverseArray(a);
        System.out.print("\nReversed Array : ");
        for(int x : a) {
            System.out.print(x+" ");
        }
    }

//    public static void reverseArray(int [] a) {
//      int start = 0;     int end = a.length-1;
//
//      while (start<end){
//          int temp = a[start];
//          a[start] = a[end];
//          a[end] = temp;
//
//          start++;       end--;
//      }
//    }




    //  2nd method
    public static void reverseArray(int [] a) {
        int start = 0;     int end = a.length-1;

        while (start<end){
            swap(a, start++, end--);
        }
    }

    public static void swap(int[] a, int i, int j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }







}