package Assignment1;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[] = {5,8,12,15,20,50,69};
		int x = 8;
		int low = 0, high = arr.length-1;
		int pos = -1;
		while(low <= high) {
			int mid = (low + high)/2;
			if (arr[mid]==x) {
				pos = mid;
				break;
			}else if(arr[mid] < x) {
				low = mid+1;
			}else {
				high = mid-1;
			}
		}
		if(pos == -1) {
			System.out.println("Not found");
		}else {
			System.out.println("Found at index " +pos);
		}
	}

}
