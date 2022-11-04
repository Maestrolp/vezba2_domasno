package zadaca4;

public class Glavna {
	public static void main (String[] args)
	{
		Avtomobil avtomobil1 = new Avtomobil ();
		avtomobil1.marka = "Hyndai";
		avtomobil1.model = "Accent";
		avtomobil1.pominatiKm = 226000;
	
	
		Avtomobil avtomobil2 = new Avtomobil ("Citroen", "C3 Aircross SUV", 532560);
		
		System.out.println(avtomobil1.marka + " " + avtomobil1.model + " " +avtomobil1.pominatiKm);
		System.out.println(avtomobil2.marka + " " + avtomobil2.model + " " + avtomobil2.pominatiKm);
	}
}
