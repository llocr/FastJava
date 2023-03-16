package ch07;

public class Plastic extends Material{

	public String toString() {
		return "재료는 Plastic 입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("플라스틱으로 프린트를 시작합니다.");
	}
	
}
