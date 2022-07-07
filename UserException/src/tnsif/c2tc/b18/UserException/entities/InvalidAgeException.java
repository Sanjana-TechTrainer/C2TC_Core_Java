package tnsif.c2tc.b18.UserException.entities;

public class InvalidAgeException extends Exception {
	public InvalidAgeException(String msg) {
		super(msg);
	}
	public InvalidAgeException() {
		super();
	}
}
