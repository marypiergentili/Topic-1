package bootcamp;

public class SingletonExample {
	
	private static SingletonExample singletonExample = null;

	private SingletonExample() {
	}

	public static SingletonExample getInstance() {
		if (singletonExample == null) {
			singletonExample = new SingletonExample();
		}
		return singletonExample;
	}

	public String sayHello() {
		return "Hello";
	}

}
