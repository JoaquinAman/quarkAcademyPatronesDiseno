package quarkAcademyPatronesDiseno.state.model;

public class News {
	private Long id;
	private String name;
	private int state;
	private String description;

	public News() {
	}

	public News(Long id, String name, int state, String description) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
