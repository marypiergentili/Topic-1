package bootcamp;

import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //creating a logger to send an information message
        
        Logger log= Logger.getLogger(App.class.getName());
        log.info("creating a singleton example");
        
        //using the singleton example to create and test a maven proyect with junit
        SingletonExample singletonExample = SingletonExample.getInstance();

		System.out.println(singletonExample.sayHello());
    }
}
