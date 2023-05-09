package day16;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MainClass_Read06 implements CommonPath {
	public static void main(String[] args) throws Exception {

		// File path = new File("c:/test/test.txt");
		FileInputStream fis = new FileInputStream(PATH);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);

		// Object o = ois.readObject();
		// TestClass06 t = (TestClass06)o;
		// 다운캐스팅

		TestClass06 t = (TestClass06) ois.readObject();

		System.out.println("이름 : " + t.getName());
		System.out.println("나이 : " + t.getAge());

		ois.close();
		bis.close();
		fis.close();

	}
}
