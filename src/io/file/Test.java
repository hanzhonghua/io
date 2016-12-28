package io.file;

import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		File f = new File("a.txt");
		// f.createNewFile();
		// f.mkdirs();
		File f2 = new File("aa\\bb\\cc\\a.txt");
		// System.out.println(f2.mkdirs());
		f2.createNewFile();
		//System.out.println(f2.delete());
		File f3 = new File("aa");
		System.out.println(f3.delete());
		//判断
		f.isDirectory();
		f.isFile();
		f.exists();
		f.canRead();
		f.canWrite();
		f.isHidden();
		//获取
		f.getAbsolutePath();
		f.getPath();
		f.getName();
		f.length();
		f.lastModified();
		String[] list = f.list();
		File[] files = f.listFiles();
		
	}
}
