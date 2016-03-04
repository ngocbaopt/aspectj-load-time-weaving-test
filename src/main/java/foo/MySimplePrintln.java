package foo;

public class MySimplePrintln {

	@TestAnnotation(value = "Test")
	public void println(String args) {
		System.out.println(args);
	}
}
