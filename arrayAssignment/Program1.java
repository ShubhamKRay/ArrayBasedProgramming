package arrayAssignment;
//1.Access all even index elements from array.
public class Program1 {
//    public static void main(String[] args) {
//        int [] arr = {10,20,30,40,50};
//        for (int i=0; i<arr.length; i++){
//            if (i%2==0)
//            System.out.print(arr[i]+" ");
//        }
//    }






//2.Access all even elements from array.
//    public static void main(String[] args) {
//        int [] arr = {10,25,30,49,50};
//        for (int i=0; i<arr.length; i++){
//            if (arr[i]%2==0)
//            System.out.print(arr[i]+" ");
//        }
//    }




//3.count all even elements from array.
//    public static void main(String[] args) {
//        int [] arr = {10,25,30,49,50};
//        int count=0;
//        for (int i=0; i<arr.length; i++){
//            if (arr[i]%2==0) {
//                System.out.print(arr[i] + " ");
//                count++;
//            }
//        }
//        System.out.println("\ncount is : "+count);
//    }











//4.Access all elements of array from end.
//    public static void main(String[] args) {
//        int [] arr = {10,25,30,49,50};
//        for (int i=arr.length-1; i>=0; i-- ){
//            System.out.print(arr[i] + " ");
//        }
//    }










//5.print and count all three-digit numbers from array.
//    public static void main(String[] args) {
//        int [] arr = {105,25,30,494,50,450,100,444,4563};
//        int count=0;
//        for (int i=arr.length-1; i>=0; i-- ){
//            if (arr[i]>99 && arr[i]<1000) {
//                System.out.print(arr[i] + " ");
//                count++;
//            }
//        }
//        System.out.println("\nCount is : "+count);
//    }






//    6.Print sum of all elements from array.
//public static void main(String[] args) {
//    int [] arr = {10,20,30,40,50};
//   int sum=0;
//    for (int i=0; i<arr.length; i++){
//          sum=sum+arr[i];
//    }
//    System.out.println("Total sum is : "+sum);
//}



//7.Print Average of all elements from array.
//    public static void main(String[] args) {
//        int [] arr = {10,20,30,40,50};
//        int sum=0 , count=0 ;
//        double avg=0;
//        for (int i=0; i<arr.length; i++){
//            sum=sum+arr[i];
//            count++;
//            avg=(double)sum/count;
//        }
//        System.out.println("Total sum is : "+sum);
//        System.out.println("Total count is :"+count);
//        System.out.println("Average is : "+avg);
//    }














//8.WAJP to print and count all the elements of array which are bigger than average value.
//    public static void main(String[] args) {
//        int [] arr = {10,20,30,40,50};
//        int count=0, sum=0;
//        double avg=0 ;
//        for (int i=0; i<arr.length; i++) {
//            sum = sum + arr[i];
//
//        }
//        avg = (double)sum / arr.length;
//        System.out.println(avg);
//
//
//        for (int i=0; i<arr.length; i++) {
//            if (arr[i] > avg) {
//                System.out.print(arr[i] + " ");
//                count++;
//            }
//
//        }
//        System.out.println("\ncount is : " + count);
//    }












//9.Print sum of all even elements from array.

//    public static void main(String[] args) {
//        int [] arr = {10,20,30,40,50};
//        int sum=0;
//        for (int i=0; i<arr.length; i++) {
//            if (i%2==0){
//                sum = sum + arr[i];
//                System.out.print(arr[i]+" ");
//            }
//
//        }
//        System.out.println("\nSum of all even elements : "+sum);
//    }













//    10.Print sum of all odd elements from array.

//    public static void main(String[] args) {
//        int [] arr = {10,20,30,40,50};
//        int sum=0;
//        for (int i=0; i<arr.length; i++) {
//            if (i%2!=0){
//                sum = sum + arr[i];
//                System.out.print(arr[i]+" ");
//            }
//
//        }
//        System.out.println("\nSum of all odd elements : "+sum);
//    }








//      11. Print sum of all elements divisible by 3.
    public static void main(String[] args) {
        int [] arr = {10,20,30,60,40,50};
        int sum=0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i]%3==0){
                sum = sum + arr[i];
                System.out.print(arr[i]+" ");
            }

        }
        System.out.println("\nSum of all  elements : "+sum);
    }
}
