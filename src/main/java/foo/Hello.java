package foo;

import javax.ws.rs.Path;

import org.springframework.stereotype.Component;

@Component
public class Hello {

	public void hello() {
		System.out.println("Hello World");
		helloPrivate();
		println("Bao test annotation");
	}
	
	private void helloPrivate() {
		System.out.println("I'm at private");
	}
	
	@Path(value = "Bao")
	public void println(String args) {
		System.out.println(args);
	}
}
