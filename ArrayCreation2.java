public class ArrayCreation2 {
	public static void main(String[] args){
		int[] nums={10, 20, 30, 40, 50};
		System.out.println(nums);
		displayDetails(nums);				
	}

	public static void displayDetails(int[] arr){
		for(int x:arr){
			System.out.println(x);
		}
	}

}