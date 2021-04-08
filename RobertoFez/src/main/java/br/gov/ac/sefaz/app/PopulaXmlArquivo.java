package br.gov.ac.sefaz.app;

import br.gov.ac.sefaz.classes.util.Util;
import br.gov.ac.sefaz.classes.xsd.Pedido;

public class PopulaXmlArquivo {

	public static void main(String[] args) {
		Pedido ped = new Pedido();
		Util uti = new Util();
		
		ped = (Pedido) uti.unmarshalFromFile(Pedido.class, "/home/bruno/eclipse-workspace/RobertoFez/src/main/resources/pedido.xml");
		System.out.println(ped.toString());
	}

}
