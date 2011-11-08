package testrestws.jersey.model.ro;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {
	
	private Long id = null;
	private String name = null;
	private String surname = null;
	private String cf = null;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getCf() {
		return cf;
	}
	public void setCf(String cf) {
		this.cf = cf;
	}
	@Override
	public String toString() {
		return "["+this.name+" "+this.surname+"]";
	}
	
	
	

}
