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
	
	public void adicionarYreubicar(int numero) {
		adicionar(numero);
		int[] aux = new int[indice];
	    int auxIndex = 0;

	        for (int i = 0; i < indice; i++) {
	            if (n[i] % 2 == 0) {
	                aux[auxIndex] = n[i];
	                auxIndex++;
	            }
	        }

	        for (int i = 0; i < indice; i++) {
	            if (n[i] % 2 != 0) {
	                aux[auxIndex] = n[i];
	                auxIndex++;
	            }
	        }
	        n = aux;
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