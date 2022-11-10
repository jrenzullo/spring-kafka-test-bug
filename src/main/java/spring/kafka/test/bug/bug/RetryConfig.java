package spring.kafka.test.bug.bug;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.retrytopic.RetryTopicConfiguration;
import org.springframework.kafka.retrytopic.RetryTopicConfigurationBuilder;

@Configuration
public class RetryConfig {
  @Bean
  public RetryTopicConfiguration omsEventListenerRetryableTopicConfiguration(KafkaTemplate<String, Object> template) {
    return RetryTopicConfigurationBuilder.newInstance()

        .create(template);
  }
}
