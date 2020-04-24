package cz0227;

import java.util.Random;
import java.util.Scanner;

public class CallName {
	/**
	 * 1.存储全班同学姓名 创建一个存储多个同学姓名的容器（数组） 键盘输入每个同学的名字，存储到容器（数组）中
	 */
	public static void addStudentName(String[] students) {
		// 键盘输入多个同学姓名存储到容器中
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < students.length; i++) {
			System.out.println("存储第" + (i + 1) + "姓名");
			// 接收控制台录入的姓名字符串
			students[i] = sc.next();
		}
	}

	/**
	 * 2.总览全班同学姓名
	 */
	public static void printStudentName(String[] students) {
		// 遍历数组，得到每个同学姓名
		for (int i = 0; i < students.length; i++) {
			String name = students[i];
			// 打印同学姓名
			System.out.println("第" + (i + 1) + "个学生姓名：" + name);
		}
	}

	/**
	 * 3.随机点名其中一人
	 */
	public static String randomStudentName(String[] students) {
		// 根据数组长度，获取随机索引
		int index = new Random().nextInt(students.length);
		// 通过随机索引从数组中获取姓名
		String name = students[index];
		// 返回随机点到的姓名
		return name;
	}

	public static void main(String[] args) {
		System.out.println("--------随机点名器--------");
		// 创建一个可以存储多个同学姓名的容量器（数组）
		String[] students = new String[3];
		/*
		 * 1.存储全班同学姓名
		 */
		addStudentName(students);
		/*
		 * 2.总览全班同学姓名
		 */
		printStudentName(students);
		/*
		 * 3. 随机点名其中一人
		 */
		String randomName = randomStudentName(students);
		System.out.println("被点到名的同学是：" + randomName);
	}
}
