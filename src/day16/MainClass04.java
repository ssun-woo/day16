package day16;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/*
 보조 Stream
 
 eclipse에서 write나 read를 사용하는데 
 기본 stream은 문자를 하나 작성할때마다 거기에 직접 접근해서 쓰는것과 같다
 (방에서 밥을 먹을때 수저하나, 반찬하나, ... 각각 옮기는것과 같음)
 
 보조스트림이라는 쟁반을 이용해서 한번에 모든 내용을 옮긴다
 (임시저장소)
 */
public class MainClass04 {
	public static void main(String[] args) throws Exception {

		FileOutputStream fos = new FileOutputStream("c:/test/test.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		// 기본 스트림을 바탕으로 만들어진다
		
		for (char i = 'A'; i <= 'D'; i++) {
			Thread.sleep(2000);
			// 2초마다 하나씩 입력됨
			// fos.write(i);
			bos.write(i);
			// 실행하고 결과를 확인하면 아무것도 입력되지 않음
			// 그냥 보조스트림에 저장된것
		}
		
		bos.flush();
		// 해당하는 보조스트림의 값을 비우고 전달함
		
		bos.write("안녕하세요".getBytes());
		// .getBytes() : ""안의 내용을 byte 배열로 바꿈
		
		bos.close();
		// 보조스트림을 닫으면서 전달하는 방법도 있다
		
		bos.write("안녕하세요".getBytes());
		// close 한 뒤에는 내용을 입력해도 입력되지 않음
		fos.close();
	}
}
