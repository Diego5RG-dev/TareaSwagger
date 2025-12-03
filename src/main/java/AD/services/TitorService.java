package AD.services;



import AD.model.Titor;
import AD.repository.TitorRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TitorService {
    private final TitorRepository titorRepository;

    @Autowired
    public TitorService(TitorRepository titorRepository){this.titorRepository = titorRepository;}

    @Transactional
    public Titor crearOuActualizarTitor(Titor titor) {
        return titorRepository.save(titor);
    }

    public List<Titor> obterTodosTitores() {
        return titorRepository.findAll();
    }

    public Optional<Titor> obterTitorPorId(Long id) { // Cambiado a Long
        return titorRepository.findById(id);
    }
}
