package spring.kafka.test.bug.bug;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.MethodMode;

@SpringBootTest
class Test1 {
	@DirtiesContext(methodMode = MethodMode.BEFORE_METHOD)
	@Test
	void test1() throws Exception {
	}
}
