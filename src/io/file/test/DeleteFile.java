package io.file.test;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		File f = new File("f://dd");
		if(f.isDirectory()){
			File[] files = f.listFiles();
			for (File file : files) {
				file.delete();
			}
		}
		f.delete();
	}
}
