package ksh.openjfx.example.service;


public class GreeterImpl implements Greeter {

	@Override
	public String greet(String name) {
		return "Hi " + name + "! Welcome to CDI + JavaFX!";
	}

}
