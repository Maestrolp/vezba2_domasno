package zadaca3;

public class Glava {
	public static void main(String[] args)
	{
		Covek c = new Covek ();
		c.ime = "Marjan";
		c.prezime = "Lazarov";
		c.embg = "0101000463000";
		
		System.out.println("Imeto na covekot e: " + c.ime);
		System.out.println("Prezimeto na covekot e: " + c.prezime);
		System.out.println("Covekot ima maticen broj: " + c.embg);
	}

}
