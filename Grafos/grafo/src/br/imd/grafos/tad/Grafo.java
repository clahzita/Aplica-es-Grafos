/**
 * Grafo, 18/10/2017
 * Todos os direitos reservados para Clarissa Alves Soares. 
 */

package br.imd.grafos.tad;

import java.util.ArrayList;
import java.util.List;

/**
 * Representação dos nde um grafo usando lista de adjacencias
 * @version 1.0
 * @author clarissa
 *
 */
public class Grafo {
	List<Vertice> vertices;
	
	public Grafo() {
		this.vertices = new ArrayList<Vertice>();
	}
	
	public void adicionarVertice(Vertice novo) {
		vertices.add(novo);		
	}
	
	public void removerVertice(Vertice vertice) {
		vertices.remove(vertice);		
	}
	
	public void adicionarAresta(Vertice origem, Vertice destino){
		origem.getAdj().add(destino);		
	}
	
	public void removerAresta(Vertice origem, Vertice destino){
		origem.getAdj().remove(destino);		
	}
	
	public void imprimirGrafo(){
		for (Vertice vertice : vertices) {
			System.out.print(vertice.getId()+"-> ");
			for (Vertice adjacente : vertice.getAdj()) {
				System.out.println(adjacente.getId()+", ");				
			}
			
			
		}
		
	}
}
