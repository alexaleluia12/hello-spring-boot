package hello.spring.aleluia.com.hellospring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GreetingTest {
	
	@Test
	public void testGreeting() {
		GreetingController controller = new GreetingController();
		Greeting result = controller.greeting("Test");
		assertEquals(0, result.getId());
		assertEquals("Hello, Test!", result.getContent());
	}
}
