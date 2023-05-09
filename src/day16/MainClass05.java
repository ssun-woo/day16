package day16;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) throws Exception{
		
		File path = new File("c:/test/test.txt");
		FileOutputStream fos = new FileOutputStream(path);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		
		System.out.println("출력 내용 입력");
		String n = new Scanner(System.in).next();
		
		dos.writeUTF(n);
		
		dos.close();
		bos.close();
		fos.close();
		// 닫는건 여는것의 역순으로 닫아준다
		
		FileInputStream fis = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
		String s = dis.readUTF();
		System.out.println("가져온 내용 : " + s);
		
		dis.close();
		bis.close();
		fis.close();
		// 닫는건 여는것의 역순으로 닫아준다
		
		
		
		// 객체 자체를 파일(다른 저장소)에 저장할 수 없다
		// 객체를 '직렬화'를 시킨 후 저장해야 한다(byte형식)
		
		// 반대로 byte값으로 된 값을 역직렬화를 통해 객체로 저장한다
	}
}



























