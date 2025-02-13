
package praticeFile;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializableMain {

	
	public static void main(String[] args) {
		
		SerializableClass serializable = null;
		SerializableReferenceClass refObject = null;
		
		try {
			System.out.println("file read has been started");
			FileInputStream input = new FileInputStream("ajithfile.pdf");
			ObjectInputStream objectInput = new ObjectInputStream(input);
			serializable = (SerializableClass) objectInput.readObject();
			objectInput.close();
			input.close();
			System.out.println("file read has been completed");
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Deserialized SerializableClass Object...");
		System.out.println("employee ID : "+serializable.getEmpId() );
		System.out.println("employee Name : "+ serializable.getEmpName());
		System.out.println("employee Department : "+ serializable.department);
		refObject = (SerializableReferenceClass) serializable.getSerializableReferenceClass();
		System.out.println("Address of city name : "+refObject.getCityName());
		System.out.println("Address of state name : "+refObject.getStateName());
	}

}
