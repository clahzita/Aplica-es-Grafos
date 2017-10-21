package br.imd.grafos.main;

import javax.swing.GrayFilter;

import br.imd.grafos.tad.Grafo;
import br.imd.grafos.tad.Vertice;

public class CaminhosMinimos {

	public static void main(String[] args) {
		Vertice s = new Vertice('s');
		Vertice t = new Vertice('t');
		Vertice x = new Vertice('x');
		Vertice y = new Vertice('y');
		Vertice z = new Vertice('z');
		
		Grafo belmanFord = new Grafo(true);
		
		belmanFord.adicionarVertice(s);
		belmanFord.adicionarVertice(t);
		belmanFord.adicionarVertice(x);
		belmanFord.adicionarVertice(y);
		belmanFord.adicionarVertice(z);
		
		belmanFord.adicionarAresta(s, t, 6);
		belmanFord.adicionarAresta(s, y, 7);
		belmanFord.adicionarAresta(t, x, 5);
		belmanFord.adicionarAresta(x, t, -2);
		belmanFord.adicionarAresta(t, y, 8);
		belmanFord.adicionarAresta(t, z, -4);
		belmanFord.adicionarAresta(y, x, -3);
		belmanFord.adicionarAresta(y, z, 9);
		belmanFord.adicionarAresta(z, x, 7);
		belmanFord.adicionarAresta(z, s, 2);
		
		belmanFord.imprimirGrafo();
		
		belmanFord.caminhoMinimoFonteUnica(s);
		
	}

}
