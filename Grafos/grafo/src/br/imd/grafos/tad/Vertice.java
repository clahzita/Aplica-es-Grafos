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
	private int grau;
	private int cor;
	private Vertice pai;
	private List<Vertice> adj;
	
	public Vertice(char id){
		this.setId(id);
		this.grau = Integer.MAX_VALUE;
		this.cor = BRANCO;
		this.pai = null;
		this.adj = new ArrayList<Vertice>();		
	}
	
	public Vertice(char id, int grau) {
		this.setId(id);
		this.grau = grau;
		this.cor = BRANCO;
		this.pai = null;;
		this.adj = new ArrayList<Vertice>();
	}



	public char getId() {
		return id;
	}


	public void setId(char id) {
		this.id = id;
	}


	
	
	public int getGrau() {
		return grau;
	}
	
	public void setGrau(int grau) {
		this.grau = grau;
	}

	public int getCor() {
		return cor;
	}

	public void setCor(int cor) {
		this.cor = cor;
	}

	public List<Vertice> getAdj() {
		return adj;
	}

	public void setAdj(List<Vertice> adj) {
		this.adj = adj;
	}
	
}
