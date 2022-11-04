package zadaca5;

public class Predmet {
	public String predmet;
	public String profesor;
	public String krediti;
	public String semestar;
	
	public Predmet ()
	{
		
	}
	
	public Predmet (String predmet)
	{
		this.predmet = predmet;
	}
	
	public Predmet (String predmet, String profesor, String krediti)
	{
		this.predmet = predmet;
		this.profesor = profesor;
		this.krediti = krediti;
	}

}
