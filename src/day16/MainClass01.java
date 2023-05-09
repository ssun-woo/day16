package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 파일 입출력
 출력 스트림을 통해 파일을 값을 내보냄
 인풋 스트림을 통해 파일의 값을 가져옴
 
 C드라이브에 'test'폴더 하나 생성(C:\test)
 */

public class MainClass01 {
	public static void main(String[] args) throws FileNotFoundException {
											// throws를 통해 예외처리
		
		// String path = "C:\\test\\test.txt";
		File path = new File("C:\\test\\aaa.txt");
		// path에는 파일의 위치가 들어와야함
		// String, File 타입 어느것을 사용해도 상관 없음
		// 자료형이 다르다 >> 기능이 서로 다르다
		
		// FileOutputStream fos = new FileOutputStream(path);
		// 실행(ctrl + F11)을 하면 해당하는 위치에 파일이 생성됨
		// FileOutputStream >> 해당하는 위치에 파일이 존재하지 않으면 새로운 파일을 생성함
		// 					>> 파일이 존재하면 원래 파일을 파괴하고 다시 만듦
		
		// path.mkdir();
		// 해당하는 위치에 폴더를 만듦
		
		// path.delete();
		// 해당하는 위치에 폴더, 파일을 삭제함
		
	}
	
	
	
}
