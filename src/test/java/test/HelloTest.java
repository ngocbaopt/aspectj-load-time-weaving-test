package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/application-config.xml"})
public class HelloTest extends AbstractJUnit4SpringContextTests {

	@Test
	public void test() {
//		fail("Not yet implemented");
		System.out.println("Testing JUnit");
	}

}
