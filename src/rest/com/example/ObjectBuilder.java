package rest.com.example;

public class ObjectBuilder {
	
	public static Args getArgsInstance() {
		Args arg = new Args();
		return arg;
	}
	
	public static Headers getHeadersInstance() {
		Headers h = new Headers();
		return h;
	}
	
	public static Example getExample() {
		Example e = new Example();
		return e;
	}
	
}
