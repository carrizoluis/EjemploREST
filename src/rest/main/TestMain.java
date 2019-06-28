package rest.main;

import rest.com.example.Args;
import rest.com.example.Example;
import rest.com.example.Headers;
import rest.com.example.ObjectBuilder;
import rest.controller.RestController;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(RestController.doGet());
		
		Args arg = ObjectBuilder.getArgsInstance();
		Headers headers = ObjectBuilder.getHeadersInstance();
		headers.setAcceptEncoding("gzip");
		headers.setCacheControl("no-cache");
		headers.setHost("httpbin.org");
		headers.setPostmanToken("a8438664-7521-4931-9bd2-bf457d262e72");
		headers.setUserAgent("okhttp/3.5.0");
		
		Example example = ObjectBuilder.getExample();
		example.setArgs(arg);
		example.setHeaders(headers);
		example.setOrigin("200.80.235.250, 200.80.235.250");
		example.setUrl("https://httpbin.org/get");
		
		System.out.println(RestController.doPost(example));
		
		
		
	}

}
