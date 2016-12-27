package io.input;

import java.io.IOException;
import java.io.StringReader;

//从内存读取
public class MemoryInput {

	public static void main(String[] args) throws IOException {
		StringReader stringReader = new StringReader(BufferInputFile.read("src/io/input/MemoryInput.java"));
		int c;
		while((c=stringReader.read())!=-1){
			//read是以int类型返回的下一个字节，想要打印必须转成char
			System.out.print((char)c);
		}
	}
}
