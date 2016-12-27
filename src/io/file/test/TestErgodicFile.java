package io.file.test;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

//遍历文件
public class TestErgodicFile {

	public static void main(String[] args) throws IOException {
		//ergodic();
		File file = new File("e://Tomcat");
		showDir(file);
	}

	public static void showDir(File f){
		if(f.length()>0){
			File[] files = f.listRoots();
			for (File file : files) {
				if(file.isDirectory()){
					showDir(file);
				}else{
					System.out.println(file.getName());
				}
			}
		}
	}
	public static void ergodic() {
		File[] files = File.listRoots();
		for (File file : files) {
			if(file.length()>0){
				//String[] list = file.list();
				String[] list = file.list(new FilenameFilter() {
					@Override
					public boolean accept(File dir, String name) {
						return name.endsWith(".txt");
					}
				});
				for (String string : list) {
					System.out.println(string);
				}
			}
		}
	}
}
