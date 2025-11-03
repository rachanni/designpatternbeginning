package singleton;

public class CreateSingletonClassEagerWay {

	public static void main(String[] args) {
		
		Jalebi jalebi1 = Jalebi.getJalebi();
		Jalebi jalebi2 = Jalebi.getJalebi();
		
		System.out.println("comapring hashCode of jalebi1 instance and jalebi2 instance: " + (jalebi1.hashCode() == jalebi2.hashCode()));
	}
}

class Jalebi{
	
//	Eager way of creating Singleton object
//	object will be created during class loading
	private static Jalebi jalebi= new Jalebi();
	
	public static Jalebi getJalebi() {
		return jalebi;
	}
}
