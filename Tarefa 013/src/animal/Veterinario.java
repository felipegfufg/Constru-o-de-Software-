package animal;

public class Veterinario {
	
	void examinar(Cachorro cachorro, Cavalo cavalo, Preguica preguica) {
		
		System.out.println("O Som do cachorro �: "  + cachorro.getSom());
		System.out.println("O Som do cavalo �: " + cavalo.getSom());
		System.out.println("O Som do pregui�a �: " + preguica.getSom());
		
	}

}
