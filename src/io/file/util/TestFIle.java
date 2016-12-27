package io.file.util;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class TestFIle {

	public static void main(String[] args) {
		File file = new File(".");
		String[] list;
		if(args.length == 0){
			list = file.list();
		}else{
			list = file.list(new DirFilter(args[0]));
		}
		Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
		for (String s : list) {
			System.out.println(s);
		}
	}
}

class DirFilter implements FilenameFilter{
	private Pattern p;
	DirFilter(String regex){
		p = p.compile(regex);
	}

	@Override
	public boolean accept(File dir, String name) {
		return p.matcher(name).matches();
	}
}
