package view;
import controller.NegativoController; 

public class Main {

	public static void main(String[] args) {
		int[] vet = {80, 48, 32, 39, -78, -37, 24, -82, 65, -19};
		int tamanho = vet.length - 1;
		int cont = 0;
		
		NegativoController nCont = new NegativoController();
		
		int resultado = nCont.contNegativo(vet, tamanho, cont);
		System.out.println("Quantidade de negativos: " + resultado);
		
	}
}
