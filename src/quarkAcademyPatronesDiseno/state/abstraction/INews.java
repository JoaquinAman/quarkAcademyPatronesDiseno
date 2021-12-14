package quarkAcademyPatronesDiseno.state.abstraction;

public interface INews {
	void delete(Long id);

	void update(Long id, String updatedDesc);
}
