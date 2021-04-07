package springey;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class ThankYouAdvice implements AfterReturningAdvice{
@Override
public void afterReturning(Object methodreturn, Method method, Object[] arguments, Object bean) throws Throwable {
	System.out.println("Packing to be done for ....:"+methodreturn);
	System.out.println("Thankyou and welcome again......................");
}
}
