package quarkAcademyPatronesDiseno.state.impl;

import quarkAcademyPatronesDiseno.state.abstraction.INews;
import quarkAcademyPatronesDiseno.state.model.News;

public class NewsService implements INews {

	RepositoryMock repositoryMock = new RepositoryMock();

	@Override
	public void delete(Long id) {

		News news = repositoryMock.findById(id);

		if (news.getState() == 1) {
			System.out.println("already deleted");
		} else {
			repositoryMock.delete(news);
		}
		repositoryMock.save();
	}

	@Override
	public void update(Long id, String updatedDesc) {
		News news = repositoryMock.findById(id);

		if (news.getState() == 1) {
			System.out.println("news is deleted");
		} else {
			repositoryMock.update(id, updatedDesc);
		}
		repositoryMock.save();
	}

}
