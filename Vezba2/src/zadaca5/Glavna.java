package zadaca5;

public class Glavna {
	public static void main (String[] args)
	{
		Predmet predmet1 = new Predmet();
		predmet1.predmet = "Објектно Ориентирано Програмирање";
		predmet1.profesor = "Илија Јолевски";
		predmet1.krediti = "6";
		predmet1.semestar = "III";
		
		Predmet predmet2 = new Predmet ("ООП");
		
		Predmet predmet3 = new Predmet ("Програмски Јазици", "Владимир Пилиповиќ", "6");
		
		System.out.println("Печатење на вредностите од стандардниот конструктор");
		System.out.println("Предмет:" +predmet1.predmet );
		System.out.println("Професор:" +predmet1.profesor);
		System.out.println("Кредити:" +predmet1.krediti );
		System.out.println("Семестар:" +predmet1.semestar);
		System.out.println();
		System.out.println("Печатење на вредностите од првиот динамичен конструктор");
		System.out.println("Предмет:" +predmet2.predmet);
		System.out.println();
		System.out.println("Печатење на вредностите од вториот динамичен конструктор");
		System.out.println("Предмет:" +predmet3.predmet);
		System.out.println("Професор:" +predmet3.profesor);
		System.out.println("Кредити:" +predmet3.krediti);
				
	}

}
