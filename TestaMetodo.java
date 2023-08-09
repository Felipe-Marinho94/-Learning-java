package contas;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoFelipe = new Conta();
		contaDoFelipe.deposita(200);
		contaDoFelipe.deposita(100);
		
		System.out.println(contaDoFelipe.getSaldo());
		
		contaDoFelipe.saca(30);
		System.out.println(contaDoFelipe.getSaldo());
		
		contaDoFelipe.saca(200);
		
		//criando uma nova conta
		Conta contaDaLeticia = new Conta();
		contaDaLeticia.deposita(100);
		
		contaDoFelipe.transfere(230, contaDaLeticia);
		System.out.println("O saldo do Felipe após a transferência é de: " + contaDoFelipe.getSaldo() + " reais.");
		System.out.println("O saldo da Leticia após a transferência é de: " + contaDaLeticia.getSaldo() + " reais.");
		

	}

}
