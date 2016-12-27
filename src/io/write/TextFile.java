package io.write;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class TextFile extends ArrayList<String> {

	//读操作
	public static String read(String path){
		StringBuffer sb = new StringBuffer();
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File(path).getAbsoluteFile()));
			String s;
			try {
				while((s=br.readLine())!=null){
					sb.append(s);
					sb.append("\n");
				}
			}finally {
				br.close();
			}
		}catch (IOException e) {
			throw new RuntimeException(e);
		}
		return sb.toString();
	}
	
	//写
	public static void write(String fileName,String text){
		try {
			PrintWriter pw = new PrintWriter(new File(fileName).getAbsoluteFile());
			pw.print(text);
			pw.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	public void write(String fileName){
		try {
			PrintWriter pw = new PrintWriter(new File(fileName).getAbsoluteFile());
			try {
				for(String itme : this){
					pw.print(itme);
				}
			} finally{
				pw.close();
			}
			
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	public TextFile(String fileName,String splitter){
		super(Arrays.asList(read(fileName).split(splitter)));
		if(get(0).equals("")){
			remove(0);
		}
	}
	public TextFile(String fileName){
		this(fileName, "\n");
	}
	
	public static void main(String[] args) {
		//读文件
		String file = read("src/io/write/TextFile.java");
		//将读出来的内容写入文件
		//write("src/io/write/text.txt", file);
		
		TextFile textFile = new	TextFile("src/io/write/text.txt");
		//textFile.write("src/io/write/text2.txt");
		
		TreeSet<String> set = new TreeSet<>();
		new TextFile("src/io/write/TextFile.java", "\\W+");
		System.out.println(set.headSet("a"));
		
	}
}
