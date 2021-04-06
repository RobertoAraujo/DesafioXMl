package br.gov.ac.sefaz.desafios;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import br.gov.ac.sefaz.desafios.xsd.Carro;

public class Xsdcarros {

	public static void main(String[] args) throws JAXBException {

		Carro carro = new Carro();
		carro.setNome("Fusca");
		carro.setPortas(2);
		/*
		 * 
		 * // aqui cria o arquivo ler o arquivo xml JAXBContext context =
		 * JAXBContext.newInstance("br.gov.ac.sefaz.desafios.xsd"); Marshaller
		 * marshaller = context.createMarshaller(); JAXBElement<Carro> element = new
		 * ObjectFactory().createCarro(carro); marshaller.marshal(element, System.out);
		 */

		JAXBContext context = JAXBContext.newInstance("br.gov.ac.sefaz.desafios.xsd");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		@SuppressWarnings("unchecked")
		JAXBElement<Carro> element = (JAXBElement<Carro>)unmarshaller.unmarshal(new File("resources/carro.xml"));
		Carro carro2 = element.getValue();

		System.out.println(carro2.toString());

	}

}
