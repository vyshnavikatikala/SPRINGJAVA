package springey;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionHandler implements ThrowsAdvice{
	public void afterThrowing(OneShoePerCustomerException e) {
		System.out.println("Exception advice called........."+e);
	}
}
