package Ex0414;

import java.util.*;

public class Ex01 {
	public static void main(String[] args) {
		Map map = new HashMap();// 创建Map对象
		map.put("1", "Jack");// 存储键和值
		map.put("2", "Rose");
		map.put("3", "Lucy");
		System.out.println("1:" + map.get("1"));// 根据键获取值
		System.out.println("2:" + map.get("2"));
		System.out.println("3:" + map.get("3"));
	}
}
