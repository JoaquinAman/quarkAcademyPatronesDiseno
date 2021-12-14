package quarkAcademyPatronesDiseno.state;

import quarkAcademyPatronesDiseno.state.impl.NewsService;

public class Main {

	public static void main(String[] args) {
		NewsService newsService = new NewsService();
		newsService.update(1l, "descripcion actualizada");
		newsService.delete(1l);
		newsService.update(1l, "descripcion actualizada DOS");
	}

}
