package springey;

import java.lang.reflect.Field;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object bean, String name) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("after init...:"+bean+":"+name);
		try {
		Field field= bean.getClass().getSuperclass().getDeclaredField("key");
		if(field!=null) {
			field.setAccessible(true);
			String value=(String)field.get(bean);
			if(value==null) {
				field.set(bean, "secret key...set by post procesor");
			}
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String name) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("before init...:"+bean+":"+name);
		return bean;
	}
	
}
