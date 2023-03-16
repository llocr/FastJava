package ch13;

import java.util.Comparator;

public class Member implements Comparator<Member>{
	
	private int memberId;         //회원 아이
	private String memberName;    //회원 이름
	
	public Member() {}
	
	public Member(int memberId, String memberName) { // 생성자
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) {
			
			Member member = (Member)obj;
			if(this.memberId == member.memberId) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public String toString() { //toString 메소드 오버로딩
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}

	@Override
	public int compare(Member member1, Member member2) { //Comparator 이었을 때 사용
		return (member1.memberId - member2.memberId);
	}

//	@Override
//	public int compareTo(Member member) { //tree 오름차순으로 만들기, Comparable 이었을 때 사용
//		
////		if(this.memberId > member.memberId) {
////			return 1;
////		} else if(this.memberId < member.memberId) {
////			return -1;
////		} else {
////			return 0;
////		} 너무 복잡해서 다른 방식으로 써보기
//		
//		return(this.memberId - member.memberId);	
//	}

	
	
}
