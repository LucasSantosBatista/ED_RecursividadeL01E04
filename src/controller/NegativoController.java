package controller;

public class NegativoController {

	public NegativoController() {
		super();
	}
	
	public int contNegativo(int[] vet, int tamanho, int cont) {
		if (tamanho == 0) {
			return cont;
		} else {
			if (vet[tamanho] < 0) {
				cont++;
			} 
		}
		return contNegativo (vet, tamanho-1, cont);
	}
}
