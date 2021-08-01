package classes;

public class ContaEspecial extends Conta {
	
	
	private double limite;

	public ContaEspecial(Pessoa cliente, int nrConta, double saldo, double limite) {
		super(cliente, nrConta, saldo);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	protected boolean temSaldo() {
		double saldo = this.getSaldo(); 
		double total = saldo + limite; 
		if(total>0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public ContaEspecial abrirConta(Pessoa cliente, int nrConta, double saldo, double limite) {
		ContaEspecial nova = new ContaEspecial(cliente,nrConta,saldo,limite); 
		return nova;
	}
	
	

}
