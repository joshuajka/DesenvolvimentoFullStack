package classes;

public class ContaPoupanca extends Conta {
	private double txCorrecao;
	
	public ContaPoupanca(Pessoa cliente, int nrConta, double saldo,double txCorrecao) {
		super(cliente, nrConta, saldo);
		this.txCorrecao = txCorrecao;
	}

	public double getTxCorrecao() {
		return txCorrecao;
	}

	public void setTxCorrecao(double txCorrecao) {
		this.txCorrecao = txCorrecao;
	}
	
	public void atualizaSaldoRendimento() {
		
	}
	
	public ContaPoupanca abrirConta(Pessoa cliente, int nrConta, double saldo, double txCorrecao) {
		ContaPoupanca nova = new ContaPoupanca(cliente,nrConta,saldo,txCorrecao); 
		return nova;
	}

	@Override
	public String toString() {
		return super.toString() + "ContaPoupanca [txCorrecao=" + txCorrecao + "]";
	}
	
	

}
