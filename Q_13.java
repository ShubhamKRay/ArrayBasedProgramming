public class Q_13 {

    public static void main(String[] args) {

        int a[] = {6, 1, 1, 1, 7, 7, 1, 1, 1, 1};

        for (int x : a)
            System.out.print(x+" ");

        int result = maxConsecutiveNum(a);
        System.out.println("\nResult is : "+result);
    }

    public static int maxConsecutiveNum(int [] a){
        int tempCount=0;
        int finalCount=0;
        for (int x : a){
            if (x==1)
                tempCount++;
            else {
                if (tempCount>finalCount)
                    finalCount=tempCount;
                tempCount=0;
            }
        }
        if (tempCount>finalCount)
            finalCount=tempCount;
        return finalCount;
    }
}
