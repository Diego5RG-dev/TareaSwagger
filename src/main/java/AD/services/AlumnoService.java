package AD.services;


import AD.model.Alumno;
import AD.repository.AlumnoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlumnoService {
    private final AlumnoRepository alumnoRepository;

    @Autowired
    public AlumnoService(AlumnoRepository alumnoRepository){this.alumnoRepository = alumnoRepository;}

    @Transactional
    public Alumno crearOuActualizarAlumno(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    public List<Alumno> obterTodosAlumnos() {
        return alumnoRepository.findAll();
    }

    public Optional<Alumno> obterAlumnoPorId(Long id) { // Cambiado a Long
        return alumnoRepository.findById(id);
    }

}
