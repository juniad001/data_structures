package searching_algo;

public class binarySearch {
	//three ways
	public static int b_search(int [] arr,int key) {
		int low = 0;
		int high = arr.length;
		for(int i = 0;i<arr.length/2;i++) {
			int mid = (low+high)/2;
			if(arr[mid] == key) {
				return i;
			}else if(key>arr[mid]) {
				low = mid+1;
			}else if(key<arr[mid]) {
				high = mid-1;
			}
		}
		return -1;
	}
	public static void b_search1(int [] arr,int target) {
		int left = 0;
		int right = arr.length;
		while(left<=right) {
			int mid = (left+right)/2;
			if(arr[mid] == target) {
				System.out.println("found key");
			}else if(target>arr[mid]){
				left = mid+1;
			}else {
				right = mid-1;
			}
		}
	}
	//recursive binary way
	public static int recb_search(int [] arr,int target,int right,int left)
	{
		if(left<=right) {
			int mid = (left+right)/2;
			if(arr[mid] == target) {
				return mid;
			}else if(target>arr[mid]) {
				return recb_search(arr, target, mid+1, right);
			}else {
				return recb_search(arr, target, left, mid-1);
			}
		}
		return -1;
	}
	
}
