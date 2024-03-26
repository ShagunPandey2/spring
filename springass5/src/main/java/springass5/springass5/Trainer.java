package springass5.springass5;

import java.util.List;

public class Trainer {
	private int id;
	private String name;
	private List<session> sessions;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<session> getSessions() {
		return sessions;
	}
	public void setSessions(List<session> sessions) {
		this.sessions = sessions;
	}
	
	
	
}
