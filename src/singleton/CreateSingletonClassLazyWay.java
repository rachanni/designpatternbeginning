package singleton;

import java.lang.reflect.Constructor;

public class CreateSingletonClassLazyWay {


	public static void main(String[] args) throws Exception{
		
		Samosa samosa1 = Samosa.getSamosa();
		System.out.println(samosa1.hashCode());
		
		Samosa samosa2 = Samosa.getSamosa();
		System.out.println(samosa2.hashCode());
		
		System.out.println("comparing hashCode of samosa1 instance and samosa2 instance: "+ (samosa1 == samosa2));
		
		/*
		 * can we break even thread safe singleton object? 
		 * Yes! By using Reflection API
		 * How can we prevent breaking Singleton pattern even by using Reflection API?
		 * Solution 1 -> if object is already created then throw exception from inside constructor
		 * Solution 2 -> use Enum
		 * 
		 */
		
//		We have already one instance -> samosa1 or samosa2 -> both have same reference
//		Constructor<Samosa> constructor= Samosa.class.getDeclaredConstructor();
//		now we can even access private data member
//		constructor.setAccessible(true);
//		java.lang.IllegalAccessException: class singleton.CreateSingletonClassLazyWay (in module designpatternbeginning) cannot access 
//		a member of class singleton.Samosa (in module designpatternbeginning) with modifiers "private"
//		how to bypass this exception?
//		so that we can even access data member of Singleton class with private modifier
//		We just need to set flag true for constructor.setAccessible(true)
//		Samosa newInstance = constructor.newInstance();
//		System.out.println("hashCode of samosa1: " + samosa1.hashCode());
//		System.out.println("hashCode of instance created using Reflection API: " + newInstance.hashCode());
//		System.out.println("comparing hashCode of instance created by using Reflection API with samosa1 hashCode: " + (samosa1.hashCode() == newInstance.hashCode()));
		
		
		
		
		
		
		
		
//		testing enum Singleton pattern
		
		Poha poha1 = Poha.INSTANCE;
		Poha poha2 = Poha.INSTANCE;
		
		System.out.println("comparing reference of poha1 and poha2: "+ (poha1 == poha2));
	}
	
}

class Samosa{
	
//	order of modifier does not matter -> but there is standard way recomended for readibility
//	private volatile static  Samosa samosa;
	
//	Recomended for readibility
	private static volatile Samosa samosa;
	
	private Samosa() {
		
//		preventing to break Singleton pattern even by using Reflection API
		
		if(samosa != null) {
			throw new RuntimeException("You are trying to break Singleton pattern!");
		}
		
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
//		
//		
		if(samosa == null) {  // // ① First check (unsynchronized)
//			// this line or before this line can be executed concurrently by multiple threads
			synchronized (Samosa.class) {
//				
				if(samosa == null) {   // ② Second check (synchronized)
//					
				samosa = new Samosa();
//				
				}
			}
//			
////			this line or after this line can be executed concurrently by multiple threads
//			
		}
//		
		return samosa;
	}
	
}



//using enum to provide safety against Reflection API attack

 enum Poha{
	
	INSTANCE;  // single element -> the one and only instance
	 
	 public void taste() {
		 
		 System.out.println("WOW! Yummy Poha!");
	 }
	 
	 
}

































