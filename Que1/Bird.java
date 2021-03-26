public class Bird{
	private int id;
	private float averageHeight;
	private double averageSpeed;
	private static boolean hasWings;
	private String name;
        private static String region;
        private static String sound;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getAverageHeight() {
		return averageHeight;
	}

	public void setAverageHeight(float averageHeight) {
		this.averageHeight = averageHeight;
	}

	public double getAverageSpeed() {
		return averageSpeed;
	}

	public void setAverageSpeed(double averageSpeed) {
		this.averageSpeed = averageSpeed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void fly(){
		System.out.println("Bird : fly()");
	}
	
	
}
