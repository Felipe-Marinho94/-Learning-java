package contas;

public class TestaSacaNegativo {
	public static void main(String[] args) {
		//Instanciando uma conta
		Conta conta = new Conta();
		conta.deposita(100);
		conta.saca(200);
		System.out.println(conta.getSaldo());
	}

}
