
/*
WAJP to insert an element at certain position of the array.

Q:21
Original array:  10  20   30   40    50    60    70
Updated array:   10  20   30    35   40    50    60    70

 */


public class Q_21 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 60, 70};

        System.out.print("Original Array : ");
        for (int x : a) {
            System.out.print(x + " ");
        }

        int [] result=insert(a, 3,35);
        System.out.print("\nUpdated Array  : ");
        for (int x : result){
            System.out.print(x+" ");
        }
    }


    public static int[] insert(int[] a, int index, int val) {
        if (index<0 || index>a.length){
            System.out.println("Element can't be insert at the given index");
            return a;
        }
        int[] b = new int[a.length+1];
        b[index]=val;

        for (int i = 0; i < b.length; i++) {
            if (i<index)
                b[i]=a[i];
            else if(i>index)
                b[i]=a[i-1];

        }
        return b;

    }

}