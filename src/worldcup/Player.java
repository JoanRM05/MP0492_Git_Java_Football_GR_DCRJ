package worldcup;

public class Player extends Person{

	private String position;
	private boolean yellowCard;
	private boolean redCard;
	
	public Player() {
		super();
		this.yellowCard = false;
		this.redCard = false;
	}

	public boolean hasYellowCard() {
		return yellowCard;
	}


	public void setYellowCard(boolean yellowCard) {
		this.yellowCard = yellowCard;
	}


	public boolean hasRedCard() {
		return redCard;
	}


	public void setRedCard(boolean redCard) {
		this.redCard = redCard;
	}


	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	public void passBall() {
		System.out.println("Pasa el balón");
	}
	
}
