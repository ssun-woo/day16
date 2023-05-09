package member;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileService implements CommonService {

	private File path;
	private FileOutputStream fos;
	private BufferedOutputStream bos;
	private ObjectOutputStream oos;

	private FileInputStream fis;
	private BufferedInputStream bis;
	private ObjectInputStream ois;

	public void inputData(MemberDTO dto) {
		// File path = new File(PATH + dto.getName() + ".txt");
		try {
			
			fos = new FileOutputStream(path);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			oos.writeObject(dto);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null)
					oos.close();
				if (bos != null)
					bos.close();
				if (fos != null)
					fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 이런경우에는 예외전가보단 try/catch를 해주는게 편함
		// 예외전가로 처리할경우 이 메소드를 처리하는 모든곳에서 예외전가 처리해줘야함
	}

	public boolean checkUser(String name) {
		path = new File(PATH + name + ".txt");
		return path.exists();
	}

	public MemberDTO readData(String name) {
		// File path = new File(PATH + dto.getName() + ".txt");
		// checkUser메소드가 가장 먼저 호출되기 때문에 저 주소가 먼저 저장됨
		MemberDTO dto = null;

		try {
			fis = new FileInputStream(path);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			dto = (MemberDTO) ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ois != null)
					ois.close();
				if (bis != null)
					bis.close();
				if (fis != null)
					fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return dto;
	}
}
