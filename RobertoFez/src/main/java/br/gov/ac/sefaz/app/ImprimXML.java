package br.gov.ac.sefaz.app;

import br.gov.ac.sefaz.classes.util.Util;
import br.gov.ac.sefaz.classes.xsd.Pedido;
import br.gov.ac.sefaz.classes.xsd.TipoProduto;

public class ImprimXML {

	public static void main(String[] args) {
		Pedido ped = new Pedido();
		Util uti = new Util();
		
		TipoProduto tp1 = new TipoProduto();
		tp1.setCodigo("123");
		tp1.setDescricao("Sabe quanto Custa isso!");
		tp1.setNome("Não sei ");
		
		TipoProduto tp2 = new TipoProduto();
		tp2.setCodigo("123");
		tp2.setDescricao("Sabe quanto!");
		tp2.setNome("Não consigo ler nada ");
		
		ped.getProduto().add(tp1);
		ped.getProduto().add(tp2);
		
		System.out.println(uti.marshal(ped));

	}

}
