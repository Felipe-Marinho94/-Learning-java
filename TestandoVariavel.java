package caracteres;

public class TestandoVariavel {

	public static void main(String[] args) {
		System.out.println("Testando condicionais. ");
		int idade = 20;
		int quantidadePessoa = 2;
		boolean acompanhado = quantidadePessoa >= 2;
		System.out.println("O valor de acompanhado é " + acompanhado);
		
		if (idade >= 18 || acompanhado) {
			System.out.println("Você pode comprar uma bebida");
		}
		else {
			System.out.println("Você não pode comprar bebidas");
		}
		
		}
}
