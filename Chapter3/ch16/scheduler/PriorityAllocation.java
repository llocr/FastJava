package ch16.scheduler;

public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("고객등급이 높은 고객의 Call 을 먼저 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무 능력 평가가 우수한 상담원에게 먼저 배정합니다.");
	}

}
