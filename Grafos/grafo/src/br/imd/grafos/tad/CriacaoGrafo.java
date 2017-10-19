/**
 * CriacaoGrafo, 18/10/2017
 */
package br.imd.grafos.tad;

/**
 * Criação de um grafo a partir da estrtura de Vertice e Grafo.
 * @version 1.0
 * @author clarissa
 *
 */
public class CriacaoGrafo {

	public static void main(String[] args) {
		Vertice a = new Vertice('a');
		Vertice b = new Vertice('b');
			
		Grafo grafo = new Grafo();
		grafo.adicionarVertice(a);
		grafo.adicionarVertice(b);
		grafo.adicionarAresta(a, b);
				
		grafo.imprimirGrafo();
	}

}
