package in.ineuron.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CompositeID implements Serializable {

	private String departmentID;
	private String eid;

	public String getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(String departmentID) {
		this.departmentID = departmentID;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	@Override
	public String toString() {
		return "CompositeID [departmentID=" + departmentID + ", eid=" + eid + "]";
	}
	
	
	
}
