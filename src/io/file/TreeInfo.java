package io.file;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Title: TreeInfo.java
 * @Description: 本地文件目录结构
 * @author Hanzhonghua
 * @date 2016年12月22日下午6:37:28
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class TreeInfo implements Iterable<File> {

	public List<File> files = new ArrayList<File>();
	public List<File> dirs = new ArrayList<File>();
	
	@Override
	public Iterator<File> iterator() {
		return files.iterator();
	}
	void addAll(TreeInfo t){
		files.addAll(t.files);
		dirs.addAll(t.dirs);
	}
	
	public static TreeInfo walk(File start,String regex){
		return recurseDirs(start,regex);
	}
	public static TreeInfo walk(File start){
		return recurseDirs(start,".*");
	}
	public static TreeInfo walk(String start){
		return recurseDirs(new File(start),".*");
	}
	static TreeInfo recurseDirs(File start, String regex) {
		TreeInfo result = new TreeInfo();
		for (File file : start.listFiles()) {
			if(file.isDirectory()){
				result.dirs.add(file);
				result.addAll(recurseDirs(file, regex));
			}else{
				if(file.getName().matches(regex)){
					result.files.add(file);
				}
			}
		}
		return result;
	}
	@Override
	public String toString() {
		return "TreeInfo [files=" + files + ", dirs=" + dirs + "]";
	}
	public static void main(String[] args) {
		if(args.length == 0){
			System.out.println(walk("."));
		}
	}
}
