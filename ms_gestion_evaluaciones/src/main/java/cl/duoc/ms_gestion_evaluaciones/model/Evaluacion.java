package cl.duoc.ms_gestion_evaluaciones.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "Evaluacion") // Puedes personalizar el nombre según tu tabla en Oracle

public class Evaluacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id automatico autoincrementable
    private Long id;
    private String NombreEstudiante,Tipo, Seccion,Materia,Periodo,Estado;
    private int Puntaje,Nota;
    public Evaluacion(String NombreEstudiante, String Tipo, String Seccion, String Materia, String Periodo, String Estado,int Puntaje,int Nota){
        this.NombreEstudiante=NombreEstudiante;
        this.Tipo=Tipo;
        this.Seccion=Seccion;
        this.Materia=Materia;
        this.Periodo=Periodo;
        this.Estado=Estado;
        this.Puntaje=Puntaje;
        this.Nota=Nota;
    } 
}
