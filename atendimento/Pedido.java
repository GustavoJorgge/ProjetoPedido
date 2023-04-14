package atendimento;

import java.util.List;
import java.util.ArrayList;

public class Pedido {
	
	Massa massa;
	Cliente cliente;
	List<Ingrediente> listaIngredientes;
	
	public Pedido() {
	}

	public double CalculaValor() {
		double valorTotal = massa.valor + (listaIngredientes.size()*2);
		
		return valorTotal;
		
	}
	
	
	
}
