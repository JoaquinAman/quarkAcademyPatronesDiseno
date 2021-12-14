package quarkAcademyPatronesDiseno.chainOfResponsability.abstraction;

public interface IapruebaResponsabilidad {

	<T> boolean apruebaResponsabilidad(T t);

	<T> boolean pasaLaSolicitud(T t);

}
