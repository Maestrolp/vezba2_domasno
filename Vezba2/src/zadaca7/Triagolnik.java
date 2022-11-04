package zadaca7;

public class Triagolnik {
	float stranaA;
	float stranaB;
	float stranaC;
	
	public Triagolnik ()
	{
		
	}
	
	public void printPerimetar() {
	    System.out.println("Perimetarot e " +(stranaA + stranaB + stranaC) +" m");
	}
	public void printPlostina() {
		float s = (stranaA + stranaB + stranaC)/2;
		float plostina = (float) Math.sqrt(s*(s-stranaA)*(s-stranaB)*(s-stranaC));
		System.out.println("Plostinata e " +plostina +" metri kvadratni");
}
}
