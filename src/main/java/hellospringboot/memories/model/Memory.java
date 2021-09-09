package hellospringboot.memories.model;

public class Memory {
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Memory(String title) {
		super();
		this.title = title;
	}
	
	public Memory() {
	}
}
