
/*
WAJP to rotate all the elements of array k position to its left.
array[] = {1, 2, 3, 4, 5, 6, 7}
k = 2
Output: {3, 4, 5, 6, 7, 1, 2}
 */


public class Q_26 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};
        rotateLeft(a,2);

        for (int x : a)
            System.out.print(x+" ");

    }


    public static void rotateLeft(int[] a, int k) {
        k=k%a.length;

        reverse(a,0,a.length-1);
        reverse(a,0,a.length-1-k);
        reverse(a,a.length-k,a.length-1);
    }
    public static void reverse(int[] a, int start, int end){
        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
}