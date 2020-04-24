package Ex0414;

import java.util.*;

public class Ex02 {
	public static void main(String[] args) {
		Map map = new HashMap();// 创建Map对象
		map.put("1", "Jack");// 存储键和值
		map.put("2", "Rose");
		map.put("3", "Lucy");
		Set keySet = map.keySet();// 获取键的集合
		Iterator it = keySet.iterator();// 迭代键的集合
		while (it.hasNext()) {
			Object key = it.next();
			Object value = map.get(key);// 获取每个键所对应的值
			System.out.println(key + ":" + value);
		}
	}
}
