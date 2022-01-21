public class assignment2 {

	public static int binarySearch(int arr[], int x) {
		int n = arr.length;
		
		int l = 0;
		int r = n-1;
		
		int res = -1;
		while(l <= r) {
			int mid = l + (r-l)/2;
			
			if(arr[mid] == x) {
				res = mid;
				break;
			}
			
			else if(arr[mid] > x)
				r = mid - 1;
			
			else
				l = mid + 1;
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
		
		int arr[] = {2, 3, 4, 10, 40};
		
		int key = 3;
		
		int res = binarySearch(arr, key);
		
		if(res == -1)
			System.out.println("Key not found");
		else
			System.out.println("Key " + key + " is found in the array at index " + res);
	}

}
