package praticeFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableMain {

	public static void main(String[] args) {

		SerializableClass serializable = new SerializableClass();
		serializable.setEmpId(1);
		serializable.setEmpName("Ajithkumar");
		serializable.setDepartment("Developer");
		SerializableReferenceClass serializableReferenceClass = new SerializableReferenceClass("Karnataka", "Bengaluru");
		serializable.setSerializableReferenceClass(serializableReferenceClass);
		System.out.println("Serializable in serializable calss object");
		try {
			System.out.println("file write has been started");
			FileOutputStream fileOutput = new FileOutputStream("ajithfile.pdf");
			ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
			objectOutput.writeObject(serializable);
			objectOutput.close();
			fileOutput.close();
			System.out.println("file write has been completed");
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}

}
