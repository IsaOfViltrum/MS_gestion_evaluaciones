package cl.duoc.ms_gestion_evaluaciones.service;


import cl.duoc.ms_gestion_evaluaciones.model.Evaluacion;
import cl.duoc.ms_gestion_evaluaciones.repository.EvaluacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EvaluacionService {

    @Autowired
    private EvaluacionRepository evaluacionRepository;

    public List<Evaluacion> obtenerTodas() {
        return evaluacionRepository.findAll();
    }

    public Optional<Evaluacion> obtenerPorId(Long id) {
        return evaluacionRepository.findById(id);
    }

    public Evaluacion guardar(Evaluacion evaluacion) {
        return evaluacionRepository.save(evaluacion);
    }

    public Evaluacion actualizar(Long id, Evaluacion evaluacionDetalles) {
        return evaluacionRepository.findById(id).map(evaluacion -> {
            evaluacion.setNombreEstudiante(evaluacionDetalles.getNombreEstudiante());
            evaluacion.setTipo(evaluacionDetalles.getTipo());
            evaluacion.setSeccion(evaluacionDetalles.getSeccion());
            evaluacion.setMateria(evaluacionDetalles.getMateria());
            evaluacion.setPeriodo(evaluacionDetalles.getPeriodo());
            evaluacion.setEstado(evaluacionDetalles.getEstado());
            evaluacion.setPuntaje(evaluacionDetalles.getPuntaje());
            evaluacion.setNota(evaluacionDetalles.getNota());
            return evaluacionRepository.save(evaluacion);
        }).orElseThrow(() -> new RuntimeException("Evaluacion no encontrada con id " + id));
    }

    public void eliminar(Long id) {
        evaluacionRepository.deleteById(id);
    }
}

