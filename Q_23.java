
/*
WAJP to rotate all the elements of array k position to its right.
array[] = {1,2,3,4,5,6,7} ,
k=2
Output: {6, 7, 1, 2, 3, 4, 5}
 */


public class Q_23 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};
        rotate(a,2);

        for (int x : a)
            System.out.print(x+" ");

    }


    public static void rotate(int[] a, int k) {
        k=k%a.length;

        reverse(a,0,a.length-1);
        reverse(a,0,k-1);
        reverse(a,k,a.length-1);
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