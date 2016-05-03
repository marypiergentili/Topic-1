package bootcamp;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTest {

	@Test
	public void test() {
		
	       SingletonExample singletonExample = SingletonExample.getInstance();
	       //junit test
			String result = singletonExample.sayHello();
			assertEquals("Hello", result);

	}
}
