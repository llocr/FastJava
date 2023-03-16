package ch13;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		
		return s1.compareTo(s2) * (-1);
	}
}

public class MemberTreeSetTest {

	public static void main(String[] args) {

//		MemberTreeSet memberTreeSet = new MemberTreeSet();
//		
//		Member memberHong = new Member(1004, "홍길동");
//		Member memberLee = new Member(1001, "이희수");
//		Member memberSon = new Member(1002, "손은수");
//		Member memberKim = new Member(1003, "김유신");
//
//		memberTreeSet.addMember(memberHong);
//		memberTreeSet.addMember(memberLee);
//		memberTreeSet.addMember(memberSon);
//		memberTreeSet.addMember(memberKim); 
//		
//		
//		memberTreeSet.showAllMember();
		
		TreeSet<String> set = new TreeSet<String>(new MyCompare());
		set.add("Park");
		set.add("Lee");
		set.add("Kim");

		System.out.println(set);
		
	}

}
