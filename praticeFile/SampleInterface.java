/**
 * 
 */
package praticeFile;

/**
 * 
 */
@FunctionalInterface
public interface SampleInterface {
	// one abstract method
	void show();
	//we can create one or more default method
	default void showAll() {
		System.out.println("show all method calling");
	}
// we can override one method in the java.lang package 
	@Override
	int hashCode();

	

	
	
}
