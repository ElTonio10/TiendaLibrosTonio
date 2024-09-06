package tonio.tienda_libros.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import tonio.tienda_libros.modelo.Libro;

public interface LibroRepositorio extends JpaRepository<Libro, Integer> {
}
