package ch02;

public class UserInfoTest {

	public static void main(String[] args) {
		
		UserInfo userKim = new UserInfo();
		
		userKim.userId = "abcdef";
		userKim.userName =  "Minju";
		userKim.userPassword = "happy0825!";
		userKim.phoneNumber = 1090306797;
		userKim.address = "인천광역시 오동로 32";
			
		userKim.showUserInfo();
		
	}

}
