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
				System.out.println("The player recieved a second yellow card. He has been expelled");
			} else { player.setYellowCard(true);
			System.out.println("The player recieved a yellow card.");}
			
		} else {player.setRedCard(true);
		System.out.println("The player received a red car directly. He has been expelled");}
	}

}
