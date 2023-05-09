package member;

import java.io.Serializable;

public class MemberDTO implements Serializable {
	private String name;
	private int age;

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

}
