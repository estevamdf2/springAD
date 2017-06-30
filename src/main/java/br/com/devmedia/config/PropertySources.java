package br.com.devmedia.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Classe responsável por carregar o arquivo config.properties
 * salvo no classpath /src/main/resources
 * 
 * @author estevamdf
 *
 */

@Configuration
@PropertySource("classpath:config.properties")
public class PropertySources {
 
   @Bean
   public static PropertySourcesPlaceholderConfigurer
     propertySourcesPlaceholderConfigurer() {
      return new PropertySourcesPlaceholderConfigurer();
   }
}
