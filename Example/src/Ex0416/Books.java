package Ex0416;

public class Books {
	int id;
	String name;// 图书名称
	double price;// 图书单价
	int number;// 图书数量
	double money;// 总价
	String Publish;// 出版社
	public Books(int id, String name, double price, int number, double money, String publish) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.number = number;
		this.money = money;
		Publish = publish;
	}
	@Override
	public String toString() {
		String message="图书编号："+id+" 图书名称："+name+" 出版社："+Publish+" 单价："+price+" 库存数量："+number;
		return message;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}
