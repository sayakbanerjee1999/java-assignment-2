public class assignment2 {
	
	public static int reverse(int num) {
		int reversed = 0;
		
		while(num > 0) {
			int digit = num % 10;
			reversed = reversed*10 + digit;
			num /= 10;
		}
		
		return reversed;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
//		int x = in.nextInt();
		
		int x = 123456;
		int res = reverse(123456);
		
		System.out.println("Original Numer -> " + x);
		System.out.println("Reverse Numer -> " + res);
	}

}
