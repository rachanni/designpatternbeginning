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
	
//	order of modifier does not matter -> but there is standard way recomended for readibility
//	private volatile static  Samosa samosa;
	
//	Recomended for readibility
	private static volatile Samosa samosa;
	
	private Samosa() {
		
	}
	
//	Lazy way of creating Singleton object
//	object will be created once getSamosa() method is called
//	not thread safe
	/*
	 * public static Samosa getSamosa() {
	 * 
	 * if(samosa == null) { // Thread A and Thread B both see null here 
	 * samosa = new Samosa(); // Both threads create separate instances -> Singleton pattern broke 
	 * 
	 * }
	 * 
	 * return samosa; 
	 * }
	 */
	
//	Two ways to make thread safe -> 1. synchronized method  2. synchronized block -> more efficient
	
//	synchronized method -> only one is allowed to execute this method at a time
//	public synchronized static Samosa getSamosa() {
//	
//		if(samosa == null) {
//			
//			samosa= new Samosa();
//		}
//		
//		return samosa;
//	}
	
	
//	synchronized block
	
	public static Samosa getSamosa() {
		
		
		if(samosa == null) {  // // ① First check (unsynchronized)
			// this line or before this line can be executed concurrently by multiple threads
			synchronized (Samosa.class) {
				
				if(samosa == null) {   // ② Second check (synchronized)
					
				samosa = new Samosa();
				
				}
			}
			
//			this line or after this line can be executed concurrently by multiple threads
			
		}
		
		return samosa;
	}
	
	
	
	
	
	
	
	
	
	
	
}

