
public class Binary_Search {
	public static void main(String[] args) {
		int[] arr = {-18,-12,0,2,6,9,35,49,56,100};
		int target = 99;
		int finalIndex = binaryLogic(arr, target);
		System.out.println("The target element index is  "+ finalIndex);

}
	static int binaryLogic(int[] arr, int target) {
		int start = 0;
		int end =  arr.length-1;
		boolean isAsc  = arr[start] < arr[end];
		while(start <= end) {
			int mid = (start+end)/2;
			if(arr[mid] == target) {
				return mid;
			}
			if(isAsc) {
				if(target < arr[mid]) {
					end = mid-1;
				} else if(target > arr[mid]) {
					start = mid+1;
				} else {
					return mid;
				}
			} else {
				if(target > arr[mid]) {
					end =  mid-1;
				} else if(target < arr[mid]) {
					start = mid+1;
				} else {
					return mid;
				}
			}
		}
		return -1;
	}
}
