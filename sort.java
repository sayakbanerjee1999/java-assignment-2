public class assignment2 {

	public static void bubbleSort(int arr[]) {
		int n = arr.length;
		
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j < n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
		
		int n = 10;
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		bubbleSort(arr);
		System.out.print("Print Sorted Array -> ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "   ");
		}
	}

}
