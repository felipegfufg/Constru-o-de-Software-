package animal;

public class AnimalTeste {
	
	Cachorro cachorro = new Cachorro("Rex", 3, "latido");
	
	Cavalo cavalo = new Cavalo("Pangaré", 6, "relincho");
	
	Preguica preguica = new Preguica("Folivora", 10, "silencio");
	
	void emite_som() {
		
		System.out.println("O Som do cachorro é: "  + cachorro.getSom());
		System.out.println("O Som do cavalo é: " + cavalo.getSom());
		System.out.println("O Som do preguiça é: " + preguica.getSom());
		
		return;
		
	}
	

}
