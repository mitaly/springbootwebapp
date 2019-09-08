package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.datasource.domain.FakeDataSource;

@SpringBootApplication
public class SpringBootWebApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringBootWebApplication.class, args);
        System.out.println(ctx.getBean(FakeDataSource.class));
    }
}
