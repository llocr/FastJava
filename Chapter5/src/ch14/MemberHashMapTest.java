package ch14;

import java.util.HashMap;

public class MemberHashMapTest {

	public static void main(String[] args) {

		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberHong = new Member(1004, "홍길동");
		Member memberLee = new Member(1001, "이희수");
		Member memberSon = new Member(1002, "손은수");
		Member memberKim = new Member(1003, "김유신");

		memberHashMap.addMember(memberHong);
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberKim); 
		
		
		memberHashMap.showAllMember();
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1001, "Kim");
		hashMap.put(1002, "Lee");
		hashMap.put(1003, "Park");
		hashMap.put(1004, "Hong");
		hashMap.put(1005, "Choi");
		
		System.out.println(hashMap);
	}

}
