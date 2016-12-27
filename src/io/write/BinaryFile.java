package io.write;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

//读取二进制文件
public class BinaryFile {

	public static byte[] read(File path) throws IOException{
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
		try {
			byte[] data = new byte[bis.available()];
			bis.read(data);
			return data;
		} finally{
			bis.close();
		}
	}
	
	public static byte[] read(String path) throws IOException{
		return read(new File(path).getAbsoluteFile());
	}
	
	public static void main(String[] args) {
		try {
			byte[] r = read("src/io/write/text.txt");
			System.out.println(r);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
