package springass3.springass3;

public class information {
	
	private int height;
	private int width;
	
	public information() {
		super();
	}
	public information(int height, int width) {
		super();
		this.height = height;
		this.width = width;

	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "height and width of triangle is : " + "height : " + this.height + ", width : " + this.width;  

	}	
}