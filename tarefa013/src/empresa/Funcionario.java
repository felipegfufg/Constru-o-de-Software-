package empresa;

public class Funcionario{
	
	private int codigo;
	private String escolaridade;
	private String instituicao; 
	private float renda = 0;
	
	
	public Funcionario(int codigo, String escolaridade) {
		super();
		this.codigo = codigo;
		this.escolaridade = escolaridade;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
	public String getInstituicao() {
		return instituicao;
	}
	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}
	
	public float renda_basica(String escolaridade, float renda){
		
		if (escolaridade.equals("não estudou")) {
			renda = 1000;
		}
		
		else if (renda == 0) {
			renda = 1000;
			if(escolaridade.equals("ensino basico")) {
				renda = (float) (renda * 1.10);
			}else if(escolaridade.equals("ensino medio")) {
				renda = (float) (renda * 1.50);
			}else if(escolaridade.equals("graduação")) {
				renda = (float) (renda * 2);
			}
		}
		
		else if ((renda != 1000) || (renda != 0)) {
			if(escolaridade.equals("ensino medio")) {
				renda = (float) (renda * 1.50);
			}else if(escolaridade.equals("graduação")) {
				renda = (float) (renda * 2);
			}
		}
		
		return renda;
		
	}

}
