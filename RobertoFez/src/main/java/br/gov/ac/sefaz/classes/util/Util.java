package br.gov.ac.sefaz.classes.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class Util {

	 // essse method imprimi no consoles
	 /**
     * Converte o objeto em uma String com estrutura XML.
     * @param object objeto a ser convertido em XML.
     * @return String contendo a estrutura XML.
     */
    public String marshal(Object object) {
        final StringWriter out = new StringWriter();
        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(object.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(
                    javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT,
                    Boolean.TRUE
            );
            marshaller.marshal(object, new StreamResult(out));
        } catch (PropertyException e) {
            e.printStackTrace();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return out.toString();
    }
    
    // essse method cruia um arquivo fico la onde vc quer 
    /**
     * Converte o objeto em uma estrutura XML.
     * @param object objeto a ser convertido em XML.
     * @param fileName nome do arquivo XML a ser gerado.
     * @return uma string com o conteudo do XML gerado.
     */
    public String marshalToFile(Object object, String fileName) {
        final StringWriter out = new StringWriter();
        JAXBContext context = null;
        Marshaller marshaller = null;
		try {
            context = JAXBContext.newInstance(object.getClass());
            marshaller = context.createMarshaller();
            marshaller.setProperty(
                    javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT,
                    Boolean.TRUE
            );
            marshaller.marshal(object, new StreamResult(out));
        } catch (PropertyException e) {
            e.printStackTrace();
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        Writer writer = null;
        try {
            writer = new FileWriter(fileName);
            marshaller.marshal(object, writer);
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }

        return out.toString();
    }
    
    // Esse cara aqui popula um xml
    /**
     * Converte um string com estrutura XML em um objeto.
     * @param clazz classe referente ao tipo do objeto a ser retornado.
     * @param stringXml string com o conteudo XML a ser convertido em objeto.
     * @return retorna um novo objeto de clazz.
     */
    public Object unmarshal(Class<?> clazz, String stringXml) {
        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(clazz);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return unmarshaller.unmarshal(
                    new StreamSource(new StringReader(stringXml))
            );
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    // tranforma um xml e popular em um xml
    /**
     * Realiza a conversao (unmarshal) de um arquivo XML em um objeto do seu tipo.
     * @param clazz classe referente ao objeto a ser criado a partir do XML.
     * @param fileXml nome do arquivo XML a ser convertido em objeto.
     * @return novo objeto.
     */
    public Object unmarshalFromFile(Class<?> clazz, String fileXml) {
        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(clazz);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return unmarshaller.unmarshal(
                    new FileInputStream(fileXml)
            );
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
