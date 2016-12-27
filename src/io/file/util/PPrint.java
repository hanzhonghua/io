package io.file.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @Title: PPrint.java
 * @Description: 添加新行并缩排所有元素(toString()方法的改善)
 * @author Hanzhonghua
 * @date 2016年12月22日下午6:37:15
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class PPrint {

	public static String pformat(Collection<?> c){
		if(c.size() == 0){
			return "[]";
		}
		
		StringBuffer sb = new StringBuffer("[");
		for (Object elem : c) {
			if(c.size() != 1){
				sb.append("\n  ");
			}
			sb.append(elem);
		}
		if(c.size() != 1){
			sb.append("\n");
		}
		sb.append("]");
		return sb.toString();
	}
	public static void pprint(Collection<?> c){
		System.out.println(pformat(c));
	}
	public static void pprint(Object[] c){
		System.out.println(pformat(Arrays.asList(c)));
	}
	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		list.add("2");
		list.add("3");
		list.add("q");
		list.add("g");
		list.add("c");
		pprint(list);
	}
}
