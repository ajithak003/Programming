package praticeFile;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableClass implements Serializable{
	
	/**
	 * generate from system serializable UID
	 */
	private static final long serialVersionUID = 1559648479638812770L;
	int empId = 0;
	String empName = null;
	String department = null;
	transient SerializableReferenceClass serializableReferenceClass;
	
	public SerializableReferenceClass getSerializableReferenceClass() {
		return serializableReferenceClass;
	}
	public void setSerializableReferenceClass(SerializableReferenceClass serializableReferenceClass) {
		this.serializableReferenceClass = serializableReferenceClass;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	private void writeObject(ObjectOutputStream os) throws IOException, ClassNotFoundException
	{
		try {
			
			os.writeObject(serializableReferenceClass.getStateName());
			os.writeObject(serializableReferenceClass.getCityName());
			os.defaultWriteObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private void readObject(ObjectInputStream input)throws IOException, ClassNotFoundException{
		try {
			
			String stateName = (String) input.readObject();
			String city = (String) input.readObject();
			serializableReferenceClass = new SerializableReferenceClass(stateName,city);
			input.defaultReadObject();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
