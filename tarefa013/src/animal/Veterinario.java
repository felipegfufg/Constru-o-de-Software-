package animal;

public class Veterinario {
	
	void examinar(Cachorro cachorro, Cavalo cavalo, Preguica preguica) {
		
		System.out.println("O Som do cachorro é: "  + cachorro.getSom());
		System.out.println("O Som do cavalo é: " + cavalo.getSom());
		System.out.println("O Som do preguiça é: " + preguica.getSom());
		
	}

}
