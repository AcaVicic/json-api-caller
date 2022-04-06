package rs.ac.bg.fon.np.json_api_caller;

import java.util.List;

public class Book {

	private String description;

	private String title;

	private List<String> authors;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	@Override
	public String toString() {
		String s = "";
		for (String a : authors) {
			s += a + "  ";
		}
		return title + "\n\n" + s + "\n\n" + description;
	}
	
	

}
