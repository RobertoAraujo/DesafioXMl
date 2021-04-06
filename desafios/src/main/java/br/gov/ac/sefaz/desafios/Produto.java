package br.gov.ac.sefaz.desafios;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Produto {
	
	private String nome;
    private double preco;
	
	
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco; 
    }
    
    @Override
    public String toString() {

        return "Nome:"+ nome + "\nPreço:"+preco+"\n";
    }
    
    public static String toXml(Object object) throws JAXBException {
	    JAXBContext context = JAXBContext.newInstance(object.getClass());
	    Marshaller m = context.createMarshaller();
	    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.FALSE); // formata o xml
	    m.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.FALSE); // Retirar tag inicial
	    StringWriter sw = new StringWriter();
	    m.marshal(object, sw);
	    String xmlString = sw.toString();

	    return xmlString;
	}
}
