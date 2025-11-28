public class Q_1typeA {
//WAJP to swap two arraysk

    public static void main(String[] args){
        int[] a={10, 20, 30, 40, 50};
        int[] b={2, 4, 6, 8, 10};

        System.out.println("Before Swap array elements are: ");
        displayValues(a);
        displayValues(b);

        int[] temp=a;
        a=b;
        b=temp;

        System.out.println("After Swap array elements are: ");
        displayValues(a);
        displayValues(b);
    }
    public static void displayValues(int[] nums){
        for(int x:nums)
            System.out.print(x+" ");
        System.out.println();
    }

}