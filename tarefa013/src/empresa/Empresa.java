package empresa;

public class Empresa {
	
	public static void main (String args[]) {
		
		int tam = 10;
		Funcionario [] funcionarios = new Funcionario[tam];
		
		for (int i=0; i<tam; i++) {
			funcionarios[i].setCodigo(i);
			funcionarios[i].setEscolaridade("escolaridade");
			
		}
		
	}
	
	

}
