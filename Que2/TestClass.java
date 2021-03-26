
public class TestClass{
	
	static Bird bird = new Bird();
	
	public static void main(String[] args){
		//Printing default values of static variables
		System.out.println("Bird : Static Variables ");
		System.out.println("HasWings :" + Bird.hasWings);
		System.out.println("Region : "+Bird.region);
		System.out.println("Sound : "+Bird.sound);
		
		//Printing default values of instance variables
		System.out.println("\nBird : Instance Variables ");
		System.out.println("Id :" + bird.getId());
		System.out.println("Average Height : "+bird.getAverageHeight()+" feet");
		System.out.println("Average Speed : "+bird.getAverageSpeed()+" mph");
		System.out.println("Name : "+bird.getName());
		
		//Printing Object Reference of Bird
		
		System.out.println("\nTestClass : Object reference");
		System.out.println("Bird : "+bird);
	}
}