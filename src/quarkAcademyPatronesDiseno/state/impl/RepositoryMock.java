package quarkAcademyPatronesDiseno.state.impl;

import quarkAcademyPatronesDiseno.state.model.News;

public class RepositoryMock {
	private String name;

	public RepositoryMock() {
	}

	public News findById(Long id) {
		News news = new News(id, "newsUno", 0, "newsDescription");
		return news;
	}

	public void delete(News news) {

	}

	public void update(Long id, String message) {

	}

	public void save() {

	}

	public RepositoryMock(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
