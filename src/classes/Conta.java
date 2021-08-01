package classes;

public class Conta {
	
	private Pessoa cliente; 
	private int nrConta; 
	private double saldo;
	public static double total = 0;
	
	public Conta(Pessoa cliente, int nrConta, double saldo) {
		super();
		this.cliente = cliente;
		this.nrConta = nrConta;
		this.saldo = saldo;
		total = total + this.saldo;
	}

	public Conta abrirConta(Pessoa cliente, int nrConta, double saldo) {
		Conta nova = new Conta(cliente,nrConta,saldo); 
		return nova;
	}
	
	public Pessoa getCliente() {
		return cliente;
	}
	
	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}
	
	public int getNrConta() {
		return nrConta;
	}
	
	public double getSaldo() {
		return saldo;
	} 
	
	public boolean sacar(double valor) {
		if(debitar(valor)) {
			return true; 
		}
		else {
			return false;
		}
	}
	
	private boolean debitar(double valor) {
		if(this.saldo<= valor) {
			this.saldo = this.saldo - valor; 
			total = total - valor;
			return true;
		}
		else {
			return false;
		}
	}
	
	protected boolean temSaldo() {
		if(this.saldo>0) {
			return true; 
		}
		else {
			return false;
		}
	}
	
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	} 
	
	public boolean transferir(Conta destino, double valor) {
		if(debitar(valor)) {
			destino.saldo = destino.saldo + valor;
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Conta [cliente=" + cliente + ", nrConta=" + nrConta + ", saldo=" + saldo + "]";
	}
	
	public static double getTotal() {
		return total;
	}
	

}
