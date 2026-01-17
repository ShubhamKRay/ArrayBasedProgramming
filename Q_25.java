
/*
WAJP to rotate each element of an array by one position in left side.
Original array : 10 20 30 40 50 60 70
Rotated array  : 20 30 40 50 60 70 10
 */

public class Q_25 {
    public static void main(String[] args) {
        int [] a = {10,20,30,40,50,60,70};
    rotateLeft(a);
        for (int x : a)
            System.out.print(x+" ");

}
public static void rotateLeft(int []a){
    int temp=a[0];
    for (int i= 1; i<a.length; i++){
        a[i-1] = a[i];
    }
    a[a.length-1] = temp;
    }

}
