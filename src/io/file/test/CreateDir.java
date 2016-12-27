package io.file.test;

import java.io.File;

public class CreateDir {

	public static void main(String[] args) {
		File f = new File("f://dd");
		if(!f.exists()){
			f.mkdir();
		}
	}
}
