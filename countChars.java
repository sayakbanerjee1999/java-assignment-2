public class assignment2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
		
		String s = "Sayak Banerjee";
		
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != ' ')
				count++;
		}
		
		System.out.println("Total number of Characters in the string " + s + " is -> " +  count);
	}

}
