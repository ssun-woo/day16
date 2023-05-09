package day16;

import java.io.File;
import java.io.FileInputStream;

public class MainClass03 {
	public static void main(String[] args) throws Exception {

		File path = new File("c:/test/test.txt");
		FileInputStream fis = new FileInputStream(path);

		while (true) {
			int ch = fis.read();
			if (ch == -1) {
				System.out.println("ch : " + ch);
				break;
				// 파일의 마지막에는 EOF(-1)이 추가됨
				// '파일의 끝을 만나면 while문을 빠져나와라'라는 뜻
			}
			System.out.println((char) ch);

		}

	}
}
