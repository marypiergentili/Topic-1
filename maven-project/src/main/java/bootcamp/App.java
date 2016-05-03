package bootcamp;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        SingletonExample singletonExample = SingletonExample.getInstance();

		System.out.println(singletonExample.sayHello());
    }
}
