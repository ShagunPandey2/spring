package springass3.springass3;


import org.springframework.beans.factory.annotation.Autowired;

public class triangle {

	@Autowired
	private information obj;

	public information getAddress() {
		return obj;
	}
	public void setAddress(information address) {
		this.obj = obj;
	}

	public triangle() {
		super();
	}
	public triangle(information obj) {
		super();
		this.obj = obj;
		System.out.println("inside constructor");
	}

	@Override
	public String toString() {
		return " The dimensions of triangle  [" + obj + "]";
	}	
}