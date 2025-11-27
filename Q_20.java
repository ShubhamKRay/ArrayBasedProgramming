
/*
WAJP to remove an element from the certain position of the array.

Q:20
Original array:  10  20   30   40    50    60    70
Updated array:   10  20   40   50    60    70

 */

public class Q_20 {

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 60, 70};

        System.out.print("Original Array : ");
        for (int x : a) {
            System.out.print(x + " ");
        }

         int [] result=remove(a, 2);
        System.out.print("\nUpdated Array  : ");
        for (int x : result){
            System.out.print(x+" ");
        }
    }

    public static int[] remove(int[] a, int index) {
        if(index<0 || index>=a.length){
            System.out.println("Element can't be removed");
            return a;
        }
        int[] b = new int[a.length-1];
        for (int i = 0; i < b.length; i++) {
            if (i<index)
                b[i]=a[i];
            else
                b[i]=a[i+1];
        }
         return b;
    }
}