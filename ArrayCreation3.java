import java.util.Scanner;
class ArrayCreation3 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Array Size: ");

		int size=sc.nextInt();
		int[] nums=new int[size];
		System.out.println("Array Elements Before Initialization:");

		displayDetails(nums);
		for(int i=0;i<nums.length;i++){
			System.out.print("Enter number "+(i+1)+": ");
			nums[i]=sc.nextInt();
		}
		System.out.println("Array elements After Initialization: ");
		displayDetails(nums);				
	}

	public static void displayDetails(int[] arr){
		for(int x:arr){
			System.out.print(x+" ");
		}
		System.out.println();
	}

    }

