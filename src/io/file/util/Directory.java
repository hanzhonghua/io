package io.file.util;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public final class Directory {

	public static File[] local(File dir,final String regex){
		return dir.listFiles(new FilenameFilter() {
			private Pattern p = Pattern.compile(regex);
			@Override
			public boolean accept(File dir, String name) {
				return p.matcher(name).matches();
			}
		});    
	}
	public static File[] local(String path,final String regex){
		return local(new File(path),regex);
	}
}
