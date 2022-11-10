package spring.kafka.test.bug.bug;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class SampleListener {
  @KafkaListener(topics = "topic1", groupId = "groupId")
  public void consume(String message) throws Exception {

  }
}
