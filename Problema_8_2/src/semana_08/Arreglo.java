package semana_08;

public class Arreglo {
	
	//  Atributos privados
	private int[] n;
	private int indice;
	//  Constructor
	public Arreglo() {
		n = new int[10];
		indice = 0;
	}
	//  Operaciones públicas básicas
	public int tamanio() {
		return indice;
	}
	public int obtener(int i) {
		return n[i];
	}
	
	private void intercambiar(int pos1, int pos2) {
		int aux = n[pos1];
		n[pos1] = n[pos2];
		n[pos2] = aux;
	}
	
	public void menorMayor() {
		for(int i = 0; i < indice; i++ ) {
			for(int j = 0; j < indice; j++) {
				if(n[i] < n[j]) {
					intercambiar(i,j);
				}
			}
		}
	}
	
	public int buscarIgual(int numero) {
		for(int i = 0 ; i<indice; i++) {
			if(n[i] == numero) {
				return i;
			}
		}
		return -1;
	}
	
	public void adicionarDiferente(int numero) {
		int num = buscarIgual(numero);
		if(num == -1) {
			adicionar(numero);
		}
	}
	
	public void adicionarDistintoYordenar(int numero) {
		adicionarDiferente(numero);
		menorMayor();
	}
	
	
	//  Operaciones privadas
	private void ampliarArreglo() {
		int[] aux = n;
		n = new int[indice + 10];
		for (int i=0; i<indice; i++)
			n[i] = aux[i];
	}
	public void adicionar(int numero) {
		if (indice == n.length)
			ampliarArreglo();
		n[indice] = numero;
		indice ++;
	}
	
}