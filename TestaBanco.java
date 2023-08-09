package cliente;

import contas.Conta;

public class TestaBanco {
	
	public static void main(String[] args) {
		//Instanciando um cliente
		Cliente felipe = new Cliente();
		felipe.titular = "Felipe Pinto Marinho";
		felipe.CPF = "60808264370";
		felipe.profissao = "Cientista de Dados";
		
		//Instanciando uma nova conta
		Conta contaDoFelipe = new Conta();
		contaDoFelipe.deposita(100);
		
	}

}
