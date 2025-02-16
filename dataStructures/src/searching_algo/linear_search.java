package searching_algo;

public class linear_search {
	public static int l_search(int [] arr,int key) {
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] == key) return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		int [] arr = {1,3,5,7,10};
		int key = 10;
		System.out.println(l_search(arr, key));
	}
}
