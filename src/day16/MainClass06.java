package day16;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MainClass06 {
	public static void main(String[] args) throws Exception{
		
		TestClass06 t = new TestClass06();
		
		t.setName("홍길동");
		t.setAge(20);
		
		// File path = new File("c:/test/test.txt");
		// 공통적으로 사용할 파일은 공통파일로 만들어서 관리하는게 편함
		
		FileOutputStream fos = new FileOutputStream( CommonPath.PATH );
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		// 전에 사용했던 DataInputStream와 다른 보조 스트림
		// ObjectOutputStream은 객체를 저장할 수 있다
		
		oos.writeObject(t);
		// 실행하면 오류가 발생함
		// NotSerializableException(직렬화를 하지 않음)
		// 't'라는 객체에 Serializable를 상속받아서 문제 해결 가능
		// 다시 실행하면 알아볼 수는 없지만 byte화 돼서 저장됨
		oos.close();
		bos.close();
		fos.close();
		
		
		
		
		
	}
}
