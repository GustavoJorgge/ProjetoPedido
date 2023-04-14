package atendimento;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Cantina {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido(); // Instancia de pedido, entidade principal.
		Cliente c = new Cliente();
		Massa m = new Massa();
		int opc=0;
		
		c.nome(JOptionPane.showInputDialog("Entre com o nome do Cliente:"));
		pedido.cliente = c;
		m.tipo(JOptionPane.showInputDialog("Entre com o tipo de Massa:"));
		m.valor(Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor da Massa:")));
		
		pedido.massa = m;
		
		pedido.listaIngredientes = new ArrayList<Ingrediente>();
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null,"1 - Bacon \n 2 - Mussarela \n 3 - Tomate \n 4 - Queijo \n 5 - Sair \n","Ingrediente",JOptionPane.INFORMATION_MESSAGE));
			Ingrediente aux = new Ingrediente();

			switch(opc) {
			case 1:
				aux.nome = "Bacon";	
				pedido.listaIngredientes.add(aux);			
			case 2:
				aux.nome = "Mussarela";
				pedido.listaIngredientes.add(aux);		
			case 3:
				aux.nome = "Tomate";
				pedido.listaIngredientes.add(aux);
			case 4:
				aux.nome = "Queijo";				
				pedido.listaIngredientes.add(aux);
			case 5:
				default:
			}		
			
		}while(opc!=5);
		
		JOptionPane.showMessageDialog(null,"Pedido feito por " + pedido.cliente.nome + "\n Massa:" + pedido.massa + " \n Valor:" + pedido.CalculaValor(),"Finalizado",JOptionPane.INFORMATION_MESSAGE);
		
	}
}

/*
for(int i = 0 ; i <= massa.size() ; i++) {
	Massa aux = massa.get(i);
	
	if(i!=massa.size()) {
		if(massa.contains(escolha)) {
			JOptionPane.showMessageDialog(null,"Possui a massa","Validação", JOptionPane.INFORMATION_MESSAGE);
		}
	}else if(i== massa.size()) {
		JOptionPane.showMessageDialog(null,"Não possui este tipo de massa","Validação",JOptionPane.ERROR_MESSAGE);
	}
}*/