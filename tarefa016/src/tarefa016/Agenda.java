package tarefa016;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	
	List<Contato> lista = new ArrayList<Contato>();
	Contato contato = new Contato();
	
	void adicionaContato() {
		contato.setNome(this.nome);
		contato.setTelefone(this.telefone);
		contato.setEmail(this.email);
		
		lista.add(contato);
		
	}
	
	void removeContato() {
		
	}
	
	void pesquisaPorNome() {
		
	}
	
	
	

}
