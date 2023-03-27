package in.ineuron.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

@Entity
@DynamicUpdate(value = true)
public class Employee implements Serializable {

	@EmbeddedId
	private CompositeID id;
	
	private String ename;
	private String ecompany;
	private String ecity;

	

	public CompositeID getId() {
		return id;
	}

	public void setId(CompositeID id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEcompany() {
		return ecompany;
	}

	public void setEcompany(String ecompany) {
		this.ecompany = ecompany;
	}

	public String getEcity() {
		return ecity;
	}

	public void setEcity(String ecity) {
		this.ecity = ecity;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", ecompany=" + ecompany + ", ecity=" + ecity + "]";
	}

	
}
