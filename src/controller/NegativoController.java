package controller;

public class NegativoController {

	public NegativoController() {
		super();
	}
	
	public int contNegativo(int[] vet, int tamanho, int cont) {
		//Condição de parada: contagem é zero, percorrendo todo vetor
		if (tamanho == 0) {
			return cont;
		} else {
			//Verifica se valor na ultima posição é negativo. Se sim, adiciona a contagem
			if (vet[tamanho] < 0) {
				cont++;
			} 
		}
		//Recursiva chamando função com contagem de posição - 1
		return contNegativo (vet, tamanho-1, cont);
	}
}
