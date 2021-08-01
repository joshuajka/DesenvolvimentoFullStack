package classes;

import java.util.Calendar;

public class PessoaFisica extends Pessoa {

	private int cpf;
	private Calendar dtNascimento; 
	private String genero;
	
	
	
	
	
	public PessoaFisica(int id, String nome, String endereco, int cpf, Calendar dtNascimento, String genero) {
		super(id, nome, endereco);
		this.cpf = cpf;
		this.dtNascimento = dtNascimento;
		this.genero = genero;
	}
	
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public Calendar getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(Calendar dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "PessoaFisica" + super.toString() + "[cpf=" + cpf + ", dtNascimento=" + dtNascimento.get(Calendar.DAY_OF_MONTH)+ "/" + dtNascimento.get(Calendar.MONTH)+ "/" + dtNascimento.get(Calendar.YEAR) + ", genero=" + genero + "]";
	} 
	
	
	
	
	
	
	
}
