package io.write;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//数据存储和恢复，DataOutputStream写入数据，DataInputStream可以精准的读取，无论读和写的平台是多么不同
public class StoringAndRecoverData {

	public static void main(String[] args) throws IOException {
		DataOutputStream os = new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream("src/io/write/text.txt")));
		os.writeDouble(3.1415926);
		os.writeInt(666);
		os.writeUTF("中国人，长城");
		os.close();
		DataInputStream is = new DataInputStream(
				new BufferedInputStream(new FileInputStream("src/io/write/text.txt")));
		double d = is.readDouble();
		System.out.println(d);
		int i = is.readInt();
		System.out.println(i);
		String utf = is.readUTF();
		System.out.println(utf);
		is.close();
	}
}
