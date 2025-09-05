package Assignment1;

public class BubbleSort {
	public static void main(String[] arg) {
		int arr[]= {2,76,34,90,1,22,44};
		System.out.println("Before Sorting: ");
		for(int i =0; i<=arr.length-1; i++) {
			System.out.print(arr[i]+"\t");
		}
		for(int i = 0; i < arr.length-1; i++ ) {
			for(int j = 0; j < arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("");
		System.out.println("After Sorting: ");
		for(int i =0; i<=arr.length-1; i++) {
			System.out.print(arr[i]+"\t");
		}
	}

}
