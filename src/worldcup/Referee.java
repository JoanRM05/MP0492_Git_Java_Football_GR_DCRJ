package worldcup;

public class Referee extends Person {

	private Player player;

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public void arbitrate(Player player){
	 int randomNum = (int)(Math.random() * 11); // 0 to 10
	 	if (randomNum >= 0 && randomNum <= 5) {
			return;
		}
		if (randomNum > 5 && randomNum <= 8) {
			if (player.hasYellowCard()) {
				player.setRedCard(true);
			} else { player.setYellowCard(true);}
			
		} else {player.setRedCard(true);}
	}

}
