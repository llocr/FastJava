package ch07;

public class Powder extends Material{

	public String toString() {
		return "재료는 Powder 입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("파우더로 프린트를 시작합니다.");
	}
	
}
