package DeliveryBoyService.delivery.boy.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import DeliveryBoyService.delivery.boy.AppContants.AppConstant;

/*
Indicates that a class declares one or more @Bean methods and may be processed by the Spring container to 
generate bean definitions and service requests for those beans at runtime, for example: 
	 @Configuration
	 public class AppConfig {

	     @Bean
	     public MyBean myBean() {
	         // instantiate, configure and return bean ...
	     }
	 }
*/


@Configuration
public class KafkaConfig {
	
	@Bean
	NewTopic topic() {
		
		return TopicBuilder.name(AppConstant.LOCATION_TOPIC_NAME).build();
		
	}

}
