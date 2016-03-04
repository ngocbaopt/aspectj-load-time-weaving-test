package foo;

public class MySimplePrintln {

	@TestAnnotation(value = "Bao")
	public void println(String args) {
		System.out.println(args);
	}
}
