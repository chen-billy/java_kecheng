package Ex0312;

/*
 * 成员内部类
 */
class Outer01 {
	private int num = 4;// 定义的成员变量

	// 下面的代码定义一个成员方法，方法中访问内部类
	public void test() {
		Inner inner = new Inner();
		inner.show();
	}

	// 下面的代码定义了一个成员内部类
	class Inner {
		public void show() {
			System.out.println("num = " + num);
		}
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Outer01 outer = new Outer01();
		outer.test();
	}
}
