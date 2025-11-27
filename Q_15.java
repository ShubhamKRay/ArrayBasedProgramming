
/*
Q:15

WAJP to swap two index values of the array.
Original array:   10   20  30   40  50  60  70
Swapped array:    10   60  30   40  50  20  70

 */


public class Q_15 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 60, 70};

        System.out.print("Original Array : ");
        for(int x : a) {
            System.out.print(x+" ");
        }

        swap(a , 1, 5);
        System.out.print("\nResultant Array : ");
        for(int x : a) {
            System.out.print(x+" ");
        }
    }

    public static void swap(int [] a, int i, int j) {
        int temp = a[i];
          a[i] = a[j];
          a[j] = temp;
}

}
