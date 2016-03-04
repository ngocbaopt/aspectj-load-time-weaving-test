
package foo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public final class Main {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("/spring/application-config.xml", Main.class);
        Hello hello = (Hello)ctx.getBean("hello");
        hello.hello();

    }
}