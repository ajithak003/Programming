/**
 * 
 */
package praticeFile;

public class SerializableReferenceClass {

	String stateName,cityName;
	public SerializableReferenceClass() {
	System.out.println("No argument constractor of SerializableReferenceClass");	
	}
	
	public SerializableReferenceClass(String state , String city) {
		this.stateName = state;
		this.cityName = city; 
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		stateName = stateName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityNAME) {
		this.cityName = cityNAME;
	}
	
	
	
}
