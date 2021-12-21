package Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public void sitdown (){

        System.out.println("Человек присел");
    }

}
