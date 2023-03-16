package ch10;

public class MemberArrayListTest {

	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(1001, "이희수");
		Member memberSon = new Member(1002, "손은수");
		Member memberKim = new Member(1003, "김유신");
		Member memberPark = new Member(1004, "박지성");
		
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberPark);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberKim.getMemberId());
		memberArrayList.showAllMember();

		
	}

}
