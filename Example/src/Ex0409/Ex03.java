package Ex0409;

import java.util.*;

class Student {
	private String id;
	private String name;

	public Student(String id, String name) {
		this.id = id;
		this.name = name;
	}

	// 重写toString（）方法
	public String toString() {
		return id + ":" + name;
	}

	// 重写hasCode方法
	public int hashCode() {
		return id.hashCode();// 返回id属性的哈希值
	}

	// 重写equals方法
	public boolean equals(Object obj) {
		if (this == obj) {// 判断是否是同一个对象
			return true;// 如果是，直接返回true
		}
		if (!(obj instanceof Student)) {// 判断对象是为Student类型
			return false;// 如果对象不是Student类型，返回false
		}
		Student stu = (Student) obj;// 将对象强转为Student类型
		boolean b = this.id.equals(stu.id);// 判断id值是否相同
		return b;// 返回判断结果
	}
}

public class Ex03 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();// 创建HashSet对象
		Student stu1 = new Student("1", "Jack");// 创建Student对象
		Student stu2 = new Student("2", "Rose");
		Student stu3 = new Student("2", "Rose");
		hs.add(stu1);// 向集合存入对象
		hs.add(stu2);
		hs.add(stu3);
		System.out.println(hs);// 打印集合中的元素
	}
}
