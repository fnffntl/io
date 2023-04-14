package sample09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {

	// users.txt파일에 기록된 사용자 정보가 저장되는 객체이다.
	private List<User> users = new ArrayList<>();
	
	public UserRepository() {
		try {
			String path = "src/sample09/users.txt";
			BufferedReader in = new BufferedReader(new FileReader(path));
			String text = null;
			while ((text = in.readLine()) != null) {
				if(text.isBlank()) {
					break;
				}
				User user = User.createUser(text);
				users.add(user);
			}
			in.close();
		} catch (IOException ex) {
			throw new RuntimeException("users.txt 파일 읽기 오류", ex);
		}
	}
}
