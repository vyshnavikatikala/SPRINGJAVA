package springey;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class FactoryClient {
	public static void main(String[] args) {
		try {
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
		//new FileSystemXmlApplicationContext();
		
		ShoeSeller seller=ctx.getBean("advisedShop",ShoeSeller.class);
		
		Customer customer=new ShoeCustomer("ramu");
		
		
		Shoe shoe=seller.sellShoe(customer);
		
		seller.sellShoe(customer);
		
		System.out.println(shoe);
		
//		ctx.getBean("shop",ShoeSeller.class);
//		ctx.getBean("shop",ShoeSeller.class);
		
		//GokulShoeShop seller2=seller.getClone();
		
		//System.out.println(seller2.getName());
		//System.out.println(seller2.getMylist());
		
		//System.out.println(seller.getFactory().getKey());
		//System.out.println(seller.getKey());
		
		ctx.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
