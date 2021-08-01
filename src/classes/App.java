package classes;

import java.util.Calendar;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar data_cpf1 = Calendar.getInstance();
		data_cpf1.set(Calendar.YEAR, 1995);
		data_cpf1.set(Calendar.MONTH, Calendar.MARCH);
		data_cpf1.set(Calendar.DAY_OF_MONTH, 20);
		
		PessoaFisica cpf1 = new PessoaFisica(1, "Joao", "SP", 12345, data_cpf1, "Masculino");
		
		ContaPoupanca contap_cpf1 = new ContaPoupanca(cpf1,1,1500,1.2);
		
		Calendar data_cpf2 = Calendar.getInstance();
		data_cpf2.set(Calendar.YEAR, 1995);
		data_cpf2.set(Calendar.MONTH, Calendar.MARCH);
		data_cpf2.set(Calendar.DAY_OF_MONTH, 20);
		
		PessoaFisica cpf2 = new PessoaFisica(1, "José", "RJ", 54321, data_cpf2, "Masculino");
		
		ContaPoupanca contap_cpf2 = new ContaPoupanca(cpf1,2,1000,1.2);
				
		ContaEspecial contae_cpf1 = new ContaEspecial(cpf1,11,3000,15000); 
		
		ContaEspecial contae_cpf2 = new ContaEspecial(cpf2,22,3000,15000); 
		
		PessoaJuridica pj1 = new PessoaJuridica(999, "Restaurante", "GO", 3578, "Alimentos"); 
		
		PessoaJuridica pj2 = new PessoaJuridica(888, "Bar", "AM", 3579, "Bebidas"); 
		
		ContaPoupanca contap_pj1 = new ContaPoupanca(pj1,5,16000,1.9);
		
		ContaEspecial contae_pj2 = new ContaEspecial(pj2,68,6000,115000);
		
		double total = 0; 
		
		total = contap_cpf1.getSaldo() + contap_cpf2.getSaldo() + contae_cpf1.getSaldo() + contae_cpf2.getSaldo() + contap_pj1.getSaldo() + contae_pj2.getSaldo();
		
		//System.out.println("Saldo total das contas:" + total);
		System.out.println("Saldo total das contas:" + Conta.getTotal());
		
		System.out.println("Relatorio geral:");
		System.out.println(contap_cpf1.toString());
		System.out.println(contap_cpf2.toString());
		System.out.println(contae_cpf1.toString());
		System.out.println(contae_cpf2.toString());
		System.out.println(contap_pj1.toString());
		System.out.println(contae_pj2.toString());
		
	}

}
