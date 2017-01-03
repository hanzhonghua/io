package io.file.test;

import java.io.File;
import java.io.FilenameFilter;

//获取D盘下以.txt结尾的文件
public class TestFileGet {

	public static void main(String[] args) {
		File f = new File("d:\\");
		//get1(f);
	}

	public static void get1(File f) {
		File[] files = f.listFiles();
		for (File file : files) {
			if(file.isFile()){
				if(file.getName().endsWith(".txt")){
					System.out.println(file.getName());
				}
			}
		}
	}
	
	public static void get2(File f){
		File[] files = f.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return false;
			}
		});
	}
}
