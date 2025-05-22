package cl.duoc.ms_gestion_evaluaciones.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cl.duoc.ms_gestion_evaluaciones.model.Evaluacion;

@Repository
public interface EvaluacionRepository extends JpaRepository<Evaluacion, Long> {
    // JpaRepository ya tiene métodos CRUD básicos
}

