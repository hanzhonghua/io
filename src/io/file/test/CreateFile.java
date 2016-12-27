package io.file.test;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		File file = new File("f://dd//dd.txt");
		if(!file.exists()){
			file.createNewFile();
		}
	}
}
