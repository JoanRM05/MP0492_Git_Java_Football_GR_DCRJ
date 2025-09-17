package worldcup;
/*
 * Class to define the Ball
 */

public class Ball {
	private String material;

	
	public Ball (String material) {
		super();
		this.material = material;
	}
	
	/* GETTERS SETTERS*/
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
		
		
	}
	public void move() {
		
		System.out.println("this is a ball");
	}
	
	
}
