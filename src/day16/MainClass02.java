package day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MainClass02 {
	public static void main(String[] args) throws Exception {
		
		File path = new File("c:/test/test.txt");
		// 경로를 나타낼때는 '/' or '\\'을 사용한다
		
		FileOutputStream fos = new FileOutputStream(path, true);
		// fos.write(97);
		// fos.write('A');
		// 예외처리를 해야할 것들이 많아짐
		// Exception이 모든 예외의 부모로 존재하기때문에 그냥 Exception으로 처리함
		// 실행 후 파일을 확인해보면 'aA'라는 문자열이 입력됨
		
		fos.write(65);
		fos.write('B');
		// 다시 실행하면 'AB'라는 문자열이 입력된상태로 나옴
		// 파일이 원래 있었다면 원래 존재하던 파일을 삭제하고 다시 만듦
		// 원래 내용을 유지하려면 FileOutputStream(path)뒤에 ',true'를 넣어줌
		
		fos.close();
		// 다 사용한뒤에는 연결 통로를 닫아줘서 자원을 더 효율적으로 사용함
		
		
		FileInputStream fis = new FileInputStream(path);
		System.out.println(fis.read());
		System.out.println(fis.read());
		// 파일의 내용을 하나씩 가져옴(int형태로 가져옴)
		
		fis.close();
		
	}
}
