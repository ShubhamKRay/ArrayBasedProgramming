
//WAJP to remove the duplicate values from the array.

//WAP to print all the elements of array exactly once.

public class Q_51 {
    public static void main(String[] args) {

        int[] a={8, 6, 8, 5, 5, 8, 6, 10, 8, 8, 7};
        printFrequency(a);
    }
    public static void printFrequency(int[] a){
        int min=a[0], max=a[0];
        for(int x:a){
            if(x>max)
                max=x;
            else if(x<min)
                min=x;
                }
        int[] freq=new int[max-min+1];

        for(int x : a)
            freq[x-min]++;

        /*
        for(int i=0;i<a.length;i++){
            freq[a[i]-min]++;
        }

         */
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0)
                System.out.print((i+min)+" ");
        }
    }
}

