/**
 * Vertice, 18/10/2017
 * Todos os direitos reservados para Clarissa Alves Soares. 
 */
package br.imd.grafos.tad;

import java.util.ArrayList;
import java.util.List;

/**
 * Representação dos nodos/vértices de um grafol
 * @version 1.0
 * @author clarissa
 *
 */
public class Vertice {
	public static final int BRANCO = 0;
	public static final int CINZA = 1;
	public static final int PRETO = 2;
	
	private char id;
	private int distancia;
	private int tempoFim;
	private int cor;
	private Vertice pai;
	private List<Vertice> adj;
	
	public Vertice(char id){
		this.setId( Character.toLowerCase(id));
		this.distancia = Integer.MAX_VALUE;
		this.cor = BRANCO;
		this.setPai(null);
		this.adj = new ArrayList<Vertice>();		
	}
	
	public Vertice(char id, int grau) {
		this.setId(Character.toLowerCase(id));
		this.distancia = grau;
		this.cor = BRANCO;
		this.setPai(null);;
		this.adj = new ArrayList<Vertice>();
	}



	public char getId() {
		return id;
	}


	public void setId(char id) {
		this.id = Character.toLowerCase(id);
	}


	
	
	public int getDistancia() {
		return distancia;
	}
	
	public void setDistancia(int grau) {
		this.distancia = grau;
	}

	public int getTempoFim() {
		return tempoFim;
	}

	public void setTempoFim(int tempoFim) {
		this.tempoFim = tempoFim;
	}

	public int getCor() {
		return cor;
	}

	public void setCor(int cor) {
		this.cor = cor;
	}
	
	public String getCorToString(){
		if(this.cor == BRANCO){
			return "branco";
		}else if (this.cor == PRETO) {
			return "preto";	
		}else{
			return "cinza";
		}
		
	}

	public Vertice getPai() {
		return pai;
	}

	public void setPai(Vertice pai) {
		this.pai = pai;
	}

	public List<Vertice> getAdj() {
		return adj;
	}

	public void setAdj(List<Vertice> adj) {
		this.adj = adj;
	}
	
	public void adicionarAdjacente(Vertice novo){
		this.getAdj().add(novo);
	}
	
	public void removerAdjacente(Vertice vertice){
		this.getAdj().remove(vertice);
	}
	
	public boolean temAdjacente(Vertice vertice){
		return this.getAdj().contains(vertice);
	}
	
	
}
