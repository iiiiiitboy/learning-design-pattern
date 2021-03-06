package ex.aaronfae.pattern.template;

/**
 * 具体子类，继承RefreshBeverage
 * 
 * 提供了咖啡制备的具体实现
 * 
 * @author AaronFae
 *
 */
public class Coffee extends RefreshBeverage {

	@Override
	protected void brew() {
		System.out.println("冲泡咖啡");
	}

	@Override
	protected void addCondiments() {
		System.out.println("加入牛奶和糖");
	}

}
