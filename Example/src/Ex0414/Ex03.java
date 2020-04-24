package Ex0414;

import java.util.*;

public class Ex03 {
	public static void main(String[] args) {
		Map map = new HashMap();// 创建Map对象
		map.put("1", "Jack");// 存储键和值
		map.put("2", "Rose");
		map.put("3", "Lucy");
		Set entrySet = map.entrySet();
		Iterator it = entrySet.iterator();// 获取Iterator对象
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) (it.next());// 获取集合中键值对映射
			Object key = entry.getKey();// 获取Entry中的键
			Object value = entry.getValue();// 获取Entry中的值
			System.out.println(key + ":" + value);
		}
	}
}
