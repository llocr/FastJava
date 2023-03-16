package ch16.player;

public class MainBoardPlay {

	public static void main(String[] args) {
		
		Player player = new Player();
		player.play(1);
		
		AdvancedLevel alevel = new AdvancedLevel();
		player.uppgradeLevel(alevel);
		player.play(2);
		
		SuperLevel slevel = new SuperLevel();
		player.uppgradeLevel(slevel);
		player.play(3);
		
	}

}
