package org.example.curriculo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface CurriculoRepository extends JpaRepository<Curriculo, Long> {
    // você pode adicionar métodos personalizados aqui, se necessário
}