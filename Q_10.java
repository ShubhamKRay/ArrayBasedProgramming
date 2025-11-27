public class Q_10 {


/*   Q:10

WAJP for below requirements:
Original array:    2      5       4    3       6
resultant array:   360   144     180   240     120

 */


    public static void getResultantArray(int[] a) {
        int multiple = 1;
        for (int x : a)
            multiple = multiple * x;
        for (int i = 0; i < a.length; i++) {
            a[i] = (multiple / a[i]);
        }
    }


    public static void main(String[] args) {
        int[] a = {2, 5, 4, 3, 6};

        System.out.print("Original Array : ");
        for (int x : a) {
            System.out.print(x + " ");
        }

        getResultantArray(a);
        System.out.print("\nResultant Array : ");
        for (int x : a) {
            System.out.print(x + " ");
        }
    }

}

