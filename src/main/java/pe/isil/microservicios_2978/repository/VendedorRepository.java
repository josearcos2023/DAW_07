package pe.isil.microservicios_2978.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.isil.microservicios_2978.model.Vendedor;

public interface VendedorRepository extends JpaRepository<Vendedor, Integer> {
}
