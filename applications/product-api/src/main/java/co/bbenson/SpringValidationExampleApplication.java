package co.bbenson;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@SpringBootApplication
@Import(SpringValidationExampleApplication.WebConfig.class)
public class SpringValidationExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringValidationExampleApplication.class, args);
    }

    @Configuration
    @EnableWebSecurity
    static class WebConfig extends WebSecurityConfigurerAdapter {

        public void configure ( WebSecurity web ) throws Exception {
            web.ignoring().anyRequest() ;

        }

        @Override
        public void configure(HttpSecurity http) throws Exception {


            http.authorizeRequests().anyRequest().permitAll()
                    .and().sessionManagement()
                    .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        }


    }
}
