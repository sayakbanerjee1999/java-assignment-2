public class assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
		
		int n = 10;
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		System.out.print("Duplicate Elements -> ");
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				if(arr[i] == arr[j]) {
					System.out.print(arr[j] + "   ");
				}
			}
		}
	}

}
