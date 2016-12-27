package io.input;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

//格式化数据读取
public class FormattedMemoryInput {

	public static void main(String[] args) throws IOException {
		DataInputStream dataInputStream = new DataInputStream(
				new ByteArrayInputStream(BufferInputFile.read("src/io/input/FormattedMemoryInput.java").getBytes()));
		while(true){
			System.out.println((char)dataInputStream.readByte());
		}
	}
}
