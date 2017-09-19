
public class Array {
	
	public static void main(String[] args) {
		
		int[] x;
		x = new int[10]; // 10 è la dimensione dell'array
						 // non l'indice massimo!!
		
		// x è l'array (o vettore)
		// 0 è l'indice (da mettere tra parentesi quadre)
		// x è detta anche struttura indicizzata
		x[0] = 10;
		x[1] = 10000;
		x[2] = 124535;
		x[9] = 22;

		int[] y = { 1, 23, 101, 22 };
		
		for(int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		
		// costrutto for each che serve per scorrere collezioni di 
		// valori (array è una collezione di valori tutti dello stesso
		// tipo)
		
		// per ogni "elemento" di tipo int contenuto in x
		for(int elemento : x) {
			System.out.println(elemento);
		}
		
	}

}
