package guru.springframework.domain;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleSampleBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware{

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean destroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean afterPropertiesSet");
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("post construct");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("Pre destroy");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("set bean factory");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("set bean name-"+name);
	}
}
