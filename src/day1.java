import java.util.Scanner;

public class day1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter the string");
		String s = kb.nextLine();
		System.out.println("Enter what part of the puzzle this is for (1 or 2)");
		int puz = kb.nextInt();
		if(puz==1) {//for part 1
			for(int i = 0; i < s.length(); i++) {
				int x,y;
				x = Character.getNumericValue(s.charAt(i));
				if((i+1 < 0) || (i+1 >= s.length()))
					y = Character.getNumericValue(s.charAt(0)); 
				else
					y = Character.getNumericValue(s.charAt(i+1));
				if(x == y) {
					sum += x;
				}
			}
			System.out.println(sum);
		}else if(puz==2) {//for part 2
			for(int i = 0; i < s.length(); i++) {
				int x,y,len=s.length()/2, newPos;
				x = Character.getNumericValue(s.charAt(i));
				if((i+len < 0) || (i+len >= s.length())) {
					y = Character.getNumericValue(s.charAt(i-len));
				}else
					y = Character.getNumericValue(s.charAt(i+len));
				if(x == y)
					sum+= x;
			}
			System.out.println(sum);
			
		}else
			System.out.println("You didn't enter the right input, exiting program now");
		
	
	}

}
