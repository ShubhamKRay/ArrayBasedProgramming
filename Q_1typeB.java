public class Q_1typeB {
//WAJP to swap two arrays

    public static void main(String[] args){
        int[] a={10, 20, 30, 40, 50};
        int[] b={2, 4, 6, 8, 10};

        System.out.println("Before Swap array elements are: ");
        displayValues(a);
        displayValues(b);

        swap(a, b);

        System.out.println("After Swap array elements are: ");
        displayValues(a);
        displayValues(b);
    }
    public static void swap(int[] a, int[] b){
        int[] temp=a;
        a=b;
        b=temp;
    }
    public static void displayValues(int[] nums){
        for(int x:nums)
            System.out.print(x+" ");
        System.out.println();
    }

}