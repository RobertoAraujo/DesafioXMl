//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.04.05 às 04:14:17 PM ACT 
//

package br.gov.ac.sefaz.desafios.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Carro complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Carro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="portas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="motoristas" type="{}Motorista" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Carro", propOrder = {
    "nome",
    "portas"
})



public class Carro {

    @XmlElement(required = true)
    
  
    protected String nome;
    
    protected int portas;

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.public List<Motorista> getMotoristas() {
        if (motoristas == null) {
            motoristas = new ArrayList<Motorista>();
        }
        return this.motoristas;
    }
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade portas.
     * 
     */
    public int getPortas() {
        return portas;
    }

    /**
     * Define o valor da propriedade portas.
     * 
     */
    public void setPortas(int value) {
        this.portas = value;
    }

	@Override
	public String toString() {
		return "Carro [nome=" + nome + ", portas=" + portas + "]";
	}

    /**
     * Gets the value of the motoristas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the motoristas property.
     * 
     * <p>    protected List<Motorista> motoristas;
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMotoristas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Motorista }
     * 
     * 
     */
    
    

}
