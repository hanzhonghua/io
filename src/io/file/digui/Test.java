package io.file.digui;

import java.io.File;
import java.io.FileFilter;

//测试递归，递归必须有一个出口，不然会导致内存溢出
public class Test {
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		//阶乘
		//System.out.println(getJiecheng(5));
		//输出指定目录所有已.xx结尾文件
		getFiles(new File("e://"));
		long end = System.currentTimeMillis();
		System.out.println("程序耗时："+(end-start)+"毫秒");
	}

	//阶乘
	/**
	 * 5!=5*4!
	 * 4!=4*3!
	 * 3!=3*2!
	 * 2!=2*1
	 * ..
	 */
	public static long getJiecheng(int a){
		if (a>1) {
			return a * getJiecheng(a - 1);
		}else{
			return 1;
		}
	}
	//输出指定目录所有已.xx结尾文件
	public static void getFiles(File f){
		
		File[] files = f.listFiles();
		for (File file : files) {
			if(file.isDirectory()){
				getFiles(file);
			}else{
				if(file.getName().endsWith(".txt")){
					System.out.println(file);
				}
			}
		}
	}
}
