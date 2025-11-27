public class Q_6 {


//       Q:6

//  	WAJP for below requirements:
//		Original array   :  2   5   4   3   6
//		resultant array  :  18  15  16  17  14


        public static void getResultantArray(int [] a) {
            int sum=0;
            for(int x : a)
                sum=sum+x;
            for(int i=0; i<a.length; i++) {
                a[i] = sum - a[i];
            }
        }



        public static void main(String[] args) {
            int [] a = {2,5,4,3,6};

            System.out.print("Original Array : ");
            for(int x : a) {
                System.out.print(x+" ");
            }

            getResultantArray(a);
            System.out.print("\nResultant Array : ");
            for(int x : a) {
                System.out.print(x+" ");
            }
        }

    }


