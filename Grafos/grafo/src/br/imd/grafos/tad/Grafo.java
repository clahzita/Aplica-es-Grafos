/**
 * Grafo, 18/10/2017
 * Todos os direitos reservados para Clarissa Alves Soares. 
 */

package br.imd.grafos.tad;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


/**
 * Representação de um grafo usando lista de adjacencias
 * @version 1.0
 * @author clarissa
 *
 */
public class Grafo {
	public static final int BRANCO = 0;
	public static final int CINZA = 1;
	public static final int PRETO = 2;
	
	
	private List<Vertice> vertices;
	private boolean dirigido;
	
	private int tempoBusca;
	
	public Grafo(boolean dirigido){
		this.dirigido = dirigido;
		this.vertices = new ArrayList<Vertice>();
	}
	
	public void adicionarVertice(Vertice novo) {
		vertices.add(novo);
	}
	
	public void removerVertice(Vertice vertice) {
		//Remove do grafo
		vertices.remove(vertice);
		//Remove o vertice da lista de adjacencias
		for (Vertice v : vertices) {
			if(v.temAdjacente(vertice)){
				v.removerAdjacente(vertice);
			}			
		}
		
		
	}
	
	public void adicionarAresta(Vertice origem, Vertice destino){
		if(!dirigido){
			destino.adicionarAdjacente(origem);
		}
		origem.adicionarAdjacente(destino);		
	}
	
	public void removerAresta(Vertice origem, Vertice destino){
		if(!dirigido){
			destino.removerAdjacente(origem);
		}
		
		origem.removerAdjacente(destino);		
	}
	
	public void imprimirGrafo(){
		for (Vertice vertice : vertices) {			
			System.out.print(vertice.getId()+" -> ");
			for (Vertice adjacente : vertice.getAdj()) {
				System.out.print(adjacente.getId()+", ");
				
			}
			System.out.println();
		}
	}
	
	public void imprimirCoresGrafo(){
		for (Vertice vertice : vertices)		
			System.out.println(vertice.getId()+" -> "+vertice.getCorToString());			
	}
	
	public void imprimirDistanciasGrafo(){
		for (Vertice vertice : vertices)		
			System.out.println(vertice.getId()+" -> "+vertice.getDistancia());			
	}
	
	public void imprimirTemposGrafo(){
		for (Vertice vertice : vertices)		
			System.out.println(vertice.getId()+" -> "+
								vertice.getDistancia()+"/"+
								vertice.getTempoFim());								;			
	}

	
	private void inicializaVertices(){
		for (Vertice vertice : vertices) {
			vertice.setCor(BRANCO);
			vertice.setDistancia(Integer.MAX_VALUE);
			vertice.setPai(null);			
		}
		
	}
	
	//BFS
	public boolean buscaEmLargura(Vertice fonte){

		//Pre-processamento
		inicializaVertices();
		
		if(fonte == null){
			return false;
		}
		fonte.setCor(CINZA);
		fonte.setDistancia(0);
		
		Queue<Vertice> fila = new LinkedList<Vertice>();
		fila.add(fonte);
		Vertice u;
		
		//Processamento
		while (!fila.isEmpty()) {
			u = fila.remove();
			List<Vertice> adj = u.getAdj();
			for (int i = 0; i < adj.size(); i++) {
				Vertice v = adj.get(i);
				if (v.getCor()==BRANCO) {
					v.setCor(CINZA);
					v.setDistancia(u.getDistancia()+1);
					v.setPai(u);
					fila.add(v);
				}
			}
			//Pós-processamento
			u.setCor(PRETO);
			
		}
		
		return true;
	}
	//DFS
	public boolean buscaEmProfundidade(Vertice fonte){
		if(fonte == null){
			return false;
		}
		//Pre-processamento
		inicializaVertices();
		
		tempoBusca = 0;//carimbo de tempo
		
		for (Vertice u : vertices) {
			if (u.getCor() == BRANCO) {
				buscaEmProfundidadeVisit(u);
			}		
		}
		return true;
	}
	
	//DFS-Visit
	private void buscaEmProfundidadeVisit(Vertice u) {
		//vertice u foi descoberto
		tempoBusca+=1;
		u.setDistancia(tempoBusca); 
		u.setCor(CINZA);
		//explorar aresta (u,v)
		for (Vertice v : u.getAdj()) {
			if (v.getCor() == BRANCO) {
				v.setPai(u);
				buscaEmProfundidadeVisit(v);
			}			
		}
		//busca terminou a lista de adjacencia de u
		u.setCor(PRETO);
		tempoBusca+=1;
		u.setTempoFim(tempoBusca);
		
		
		
	}

	
	
	
	
}
