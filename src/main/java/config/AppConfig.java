/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package config;





import service.TestDrivenTests;
import service.TestDrivenTestsImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Zaakir
 */

@Configuration
public class AppConfig {
@Bean(name="tt") 
public TestDrivenTests getService(){
return new TestDrivenTestsImpl();
} 
   
}


