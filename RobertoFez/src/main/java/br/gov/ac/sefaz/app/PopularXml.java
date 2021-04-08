package br.gov.ac.sefaz.app;

import br.gov.ac.sefaz.classes.util.Util;
import br.gov.ac.sefaz.classes.xsd.Pedido;

public class PopularXml {

	public static void main(String[] args) {
		
		Util util = new Util();
		
		String xml1="<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<pedido>\n" + 
				"    <produto codigo=\"123\">\n" + 
				"        <nome>Não sei </nome>\n" + 
				"        <descricao>Sabe quanto Custa isso!</descricao>\n" + 
				"    </produto>\n" + 
				"    <produto codigo=\"123\">\n" + 
				"        <nome>Não consigo ler nada </nome>\n" + 
				"        <descricao>Sabe quanto!</descricao>\n" + 
				"    </produto>\n" + 
				"</pedido>";
		
		Pedido ped = (Pedido) util.unmarshal(Pedido.class, xml1);

		System.out.println(ped.toString());

	}

}
