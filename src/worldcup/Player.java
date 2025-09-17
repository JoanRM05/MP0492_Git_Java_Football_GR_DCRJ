package worldcup;

public class Player extends Person{

	private String position;
	
	public Player(String position) {
		super();
		this.position = position;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	public void passBall() {
		System.out.println("Pasar el balón");
	}
	
}
