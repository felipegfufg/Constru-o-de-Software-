package animal;

public class AnimalTeste {
	
	Cachorro cachorro = new Cachorro("Rex", 3, "latido");
	
	Cavalo cavalo = new Cavalo("Pangar�", 6, "relincho");
	
	Preguica preguica = new Preguica("Folivora", 10, "silencio");
	
	void emite_som() {
		
		System.out.println("O Som do cachorro �: "  + cachorro.getSom());
		System.out.println("O Som do cavalo �: " + cavalo.getSom());
		System.out.println("O Som do pregui�a �: " + preguica.getSom());
		
		return;
		
	}
	

}
