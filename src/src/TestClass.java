
import java.util.Scanner;

public class TestClass {

	public static void main(String[] args)
	{
		StringManipulator josh = new StringManipulator();
		Scanner in = new Scanner(System.in);
		String newString = "";
		
		System.out.print("Please print the String you want to modify: ");
		String str = in.next();
		in.nextLine();
		
		System.out.print("If you want to run the noVowels method, type 1. If you want to run the reverse method, type 2: " );
		int method = in.nextInt();
		in.nextLine();
		
		if (method == 1)
			newString = josh.noVowels(str);
		else if (method == 2)
			newString = josh.reverse(str);
		while (method < 1 || method >  2)
		{
			System.out.print("You entered a wrong number. Please enter it again: " );
			method = in.nextInt();
			in.nextLine();
		}
		System.out.print(newString);
	}

}
