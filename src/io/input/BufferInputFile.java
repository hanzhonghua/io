package io.input;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

//使用BufferReader字符流从磁盘一行一行读取文件
public class BufferInputFile {
	
	public static String read(String path) throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader(path));
		String s;
		StringBuffer sb = new StringBuffer();
		while((s = reader.readLine()) != null){
			sb.append(s+"\n");
		}
		reader.close();
		return sb.toString();
	}
	public static List<String> read2(String path) throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader(path));
		String s;
		List<String> list = new LinkedList<>();
		while((s = reader.readLine()) != null){
			list.add(s+"\n");
		}
		reader.close();
		return list;
	}

	public static void main(String[] args) {
		try {
			//System.out.println(read("src/io/input/BufferInputFile.java"));
			List<String> list = read2("src/io/input/BufferInputFile.java");
			System.out.println(list);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
