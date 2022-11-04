package zadaca7;
import java.util.Scanner;


public class Glavna {
	public static void main (String[] args)
	{

		Scanner input = new Scanner(System.in);
		System.out.println("Vnesi gi stranite");
		Triagolnik object1 = new Triagolnik ();
		object1.stranaA = input.nextFloat();
		object1.stranaB = input.nextFloat();
		object1.stranaC = input.nextFloat();
		object1.printPerimetar();
		object1.printPlostina();
	}
	


}
