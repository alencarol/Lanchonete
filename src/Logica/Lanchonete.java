package Logica;

import java.util.ArrayList;


public class Lanchonete {
    
    public ArrayList<String> ingredientes = new ArrayList<String>(); //armazena o nome os ingredientes pedidos
    public ArrayList<Double> precos = new ArrayList<Double>(); //armazena o preço dos ingredientes pedidos
    public double total; //armazena o valor total do lanche
	
   
    
    public void imprimePedido() {
    	//precorre e imprime o nome dos imgredientes na ordem dos pedidos
    	for (int i = 0; i < ingredientes.size(); i++) {
    		System.out.println(ingredientes.get(i) + ".........." + precos.get(i));
    	}
    	
    	System.out.println("\n" + "TOTAL:  " + total); //imprime o valor toal no final
    }
    
    public void salvandoIngrediente(String nome, double preco) {
    	//adiciona um pedido aos arrays e imcrementa o preço no valor total
    	ingredientes.add(nome);
    	precos.add(preco);
    	total += preco;
    }

}
