package cz0225;

/*
 * for循环
 */
public class Example14 {
	public static void main(String[] args) {
		int sum = 0;// 定义变量sum，用于记住累加的和
		for (int i = 1; i <= 4; i++) {// i的值会在1~4之间变化
			sum += i;// 实现sum变量与i的累加
		}
		System.out.println("sum = " + sum);// 打印累加的和
	}
}
