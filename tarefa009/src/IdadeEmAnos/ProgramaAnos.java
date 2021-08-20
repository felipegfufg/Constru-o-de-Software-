package IdadeEmAnos;
import java.util.Scanner;

public class ProgramaAnos {
	
	static Pessoa pessoa = new Pessoa();
	

	public static void main(String[] args) {
		System.out.println("Dia Nascimento: ");
		Scanner scanner = new Scanner(System.in);
		pessoa.setDia(scanner.nextInt());
		
		System.out.println("Mes Nascimento: ");
		pessoa.setMes(scanner.nextInt());
		
		System.out.println("Ano Nascimento: ");
		
		pessoa.setAno(scanner.nextInt());
		
		
		System.out.println("Dia Atual: ");
		
		int diaAtual = scanner.nextInt();
		
		System.out.println("Mes Atual: ");
		
		int mesAtual = scanner.nextInt();
		
		System.out.println("Ano Atual: ");
		
		int anoAtual = scanner.nextInt();
		
		int idadeEmAnos = (anoAtual - pessoa.getAno() - 1)*365 + (mesAtual - pessoa.getMes() - 1)*30 + diaAtual - pessoa.getDia();
		
		System.out.println(idadeEmAnos);
		
		return;
	}

}
