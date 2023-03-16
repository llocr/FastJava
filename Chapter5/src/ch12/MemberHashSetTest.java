package ch12;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "이희수");
		Member memberSon = new Member(1002, "손은수");
		Member memberKim = new Member(1003, "김유신");

		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberKim);
		 
		memberHashSet.showAllMember();
		
		Member memberHong = new Member(1003, "홍길동");
		memberHashSet.addMember(memberHong);
		
		memberHashSet.showAllMember();
		
		

		
	}

}
