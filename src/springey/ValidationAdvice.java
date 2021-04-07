package springey;

import java.util.ArrayList;
import java.util.List;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class ValidationAdvice implements MethodInterceptor{
	List<Customer> list=new ArrayList<>();
	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		System.out.println("around advice called...");
		
		Customer customer=(Customer)mi.getArguments()[0];
		if(list.contains(customer)) {
			throw new OneShoePerCustomerException("Only one shoe per customer.....");
		}
		else {
			list.add(customer);
			Object shoe=mi.proceed();
			return shoe;
		}
	}
}
