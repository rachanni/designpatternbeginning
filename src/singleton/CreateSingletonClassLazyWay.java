package singleton;

public class CreateSingletonClassLazyWay {


	public static void main(String[] args) {
		
		Samosa samosa1 = Samosa.getSamosa();
		System.out.println(samosa1.hashCode());
		
		Samosa samosa2 = Samosa.getSamosa();
		System.out.println(samosa2.hashCode());
		
		System.out.println("comparing hashCode of samosa1 instance and samosa2 instance: "+ (samosa1 == samosa2));
	}
	
}

class Samosa{
	
	private static Samosa samosa;
	
	private Samosa() {
		
	}
	
//	Lazy way of creating Singleton object
	public static Samosa getSamosa() {
		
		if(samosa == null) {
			samosa = new Samosa();
		}
		
		return samosa;
	}
}

