package br.imd.grafos.main;

import br.imd.grafos.tad.Grafo;
import br.imd.grafos.tad.Vertice;

public class VerificarOrdenacaoTopologica {
	public static void main(String[] args) {
		Vertice cueca = new Vertice('2');
		Vertice calcas = new Vertice('3');
		Vertice cinto = new Vertice('7');
		Vertice camisa = new Vertice('6');
		Vertice gravata = new Vertice('8');
		Vertice paleto = new Vertice('9');
		Vertice meias = new Vertice('1');
		Vertice sapatos = new Vertice('4');
		Vertice relogio = new Vertice('5');
		
		Grafo grafoRoupas = new Grafo(true);
		
		grafoRoupas.adicionarVertice(camisa);
		grafoRoupas.adicionarVertice(cueca);
		grafoRoupas.adicionarVertice(meias);
		grafoRoupas.adicionarVertice(relogio);
		grafoRoupas.adicionarVertice(sapatos);
		grafoRoupas.adicionarVertice(paleto);
		grafoRoupas.adicionarVertice(gravata);
		grafoRoupas.adicionarVertice(cinto);
		grafoRoupas.adicionarVertice(calcas);
		
		
		
		grafoRoupas.adicionarAresta(camisa, gravata);
		grafoRoupas.adicionarAresta(gravata,paleto);		
		grafoRoupas.adicionarAresta(camisa, cinto);
		grafoRoupas.adicionarAresta(cinto, paleto);
		grafoRoupas.adicionarAresta(calcas, cinto);
		grafoRoupas.adicionarAresta(cueca, calcas);
		grafoRoupas.adicionarAresta(cueca, sapatos);
		grafoRoupas.adicionarAresta(calcas, sapatos);
		grafoRoupas.adicionarAresta(meias, sapatos);
		
		grafoRoupas.imprimirGrafo();
		grafoRoupas.ordenacaoTopologica();
		
		
		
		
		
		
	}

}

