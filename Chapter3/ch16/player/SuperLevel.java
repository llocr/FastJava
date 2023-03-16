package ch16.player;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("매우 빠르 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("엄청 높이 jump 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("turn 합니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println(" ***** 레벨 : 고급자 *****");
	}

}
