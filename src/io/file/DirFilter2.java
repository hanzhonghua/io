package io.file;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.charset.MalformedInputException;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirFilter2 {

	public static FilenameFilter filter(final String regex){
		return new FilenameFilter() {
			private Pattern p = Pattern.compile(regex);
			@Override
			public boolean accept(File dir, String name) {
				return p.matcher(name).matches();
			}
		};
	}
	public static void main(String[] args) {
		File file = new File(".");
		String[] list;
		if(args.length == 0){
			list = file.list();
		}else{
			list = file.list(filter(args[0]));
		}
		Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
		for (String s : list) {
			System.out.println(s);
		}
	}
}
