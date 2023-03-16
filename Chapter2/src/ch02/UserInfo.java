package ch02;

public class UserInfo {
	String userId;
	String userPassword;
	String userName;
	String address;
	int phoneNumber;
	
	void showUserInfo() {
		System.out.println(userId + "고객님의 성함은 " + userName + "이고, 전화번호는 0" + phoneNumber + ", 주소는 " + address + " 입니다.");
	}
}
