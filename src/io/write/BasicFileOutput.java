package io.write;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

import io.input.BufferInputFile;

//将读出来的数据写入
public class BasicFileOutput {

	static String path = "src/io/write/BasicFileOutput.java";
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new StringReader(BufferInputFile.read(path)));
		PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(path)));
		int line = 1;
		String s;
		while((s=reader.readLine())!=null){
			writer.println(line+++":"+s);
		}
		writer.close();
		System.out.println(BufferInputFile.read(path));
		
	}
}
