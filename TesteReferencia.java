package contas;

public class TesteReferencia {

	public static void main(String[] args) {
		//Criando uma conta
		Conta primeiraConta = new Conta();
		primeiraConta.deposita(300);
		System.out.println("O saldo da primeira conta é: " + primeiraConta.getSaldo() + " reais.");
		
		//Instanciando uma nova conta
		Conta segundaConta = new Conta();
		System.out.println("O saldo da segunda conta é: " + segundaConta.getSaldo() + " reais.");
		
		segundaConta.deposita(100);
		System.out.println("O saldo da segunda conta é: " + segundaConta.getSaldo() + " reais.");
		System.out.println("O saldo da primeira conta é: " + primeiraConta.getSaldo() + " reais.");
		
		if(primeiraConta == segundaConta) {
			System.out.println("São as mesmas contas.");
			
		}
		else {
			System.out.println("São contas diferentes.");
		}

	}

}
