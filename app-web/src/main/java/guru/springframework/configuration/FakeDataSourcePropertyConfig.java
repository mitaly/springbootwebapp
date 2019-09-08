package guru.springframework.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import guru.springframework.datasource.domain.FakeDataSource;

@Configuration
@PropertySource("classpath:fakedatasource.properties")
public class FakeDataSourcePropertyConfig {

	@Value("${app.username}")
	private String username;
	@Value("${app.password}")
	private String password;
	@Value("${app.host}")
	private String hostname;
	
	@Bean
	public FakeDataSource fakeDataSource(){
		return new FakeDataSource(username, password, hostname);
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
