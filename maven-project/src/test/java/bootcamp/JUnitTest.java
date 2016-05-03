package bootcamp;

import junit.framework.TestCase;

public class JUnitTest extends TestCase {
	
	
	public void test() {
		
	       SingletonExample singletonExample = SingletonExample.getInstance();

			String result = singletonExample.sayHello();
			assertEquals("Hello", result);
	}

}
