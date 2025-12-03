package AD.controller;

import AD.model.Titor;
import AD.repository.TitorRepository;
import AD.services.TitorService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(TitorController.MAPPING)
public class TitorController {

    public static final String MAPPING = "/base";

    @Autowired
    private TitorRepository titorRepository;
    @Autowired
    private TitorService titorService;


    @Operation(summary = "Método que saúda")
    @PostMapping("/saudo")
    public String saudo() {
        return "Boas";
    }

    @Operation(summary = "Crear unha novo titor")
    @PostMapping("/titor")
    public Titor crearTitor(@RequestBody Titor titor) {
        return titorService.crearOuActualizarTitor(titor);
    }

    @Operation(summary = "Obter todas as titores")
    @GetMapping("/titor")
    public List<Titor> obterPersoas() {
        return titorService.obterTodosTitores();
    }

    @Operation(summary = "Obter persoa por ID")
    @GetMapping("/titor/{id}")
    public ResponseEntity<Titor> obterPersoaPorId(@PathVariable Long id) {
        Optional<Titor> persoa = titorService.obterTitorPorId(id);
        return persoa.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @Operation(summary = "Actualizar unha persoa")
    @PutMapping("/titor/{id}")
    public ResponseEntity<Titor> actualizarPersoa(@PathVariable Long id, @RequestBody Titor persoaDetails) {
        Optional<Titor> persoaOptional = titorService.obterTitorPorId(id);
        if (persoaOptional.isPresent()) {
            Titor titor = persoaOptional.get();
            titor.setNome(persoaDetails.getNome());
            Titor persoaActualizada = titorService.crearOuActualizarTitor(titor);
            return ResponseEntity.ok(persoaActualizada);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @Operation(summary = "Eliminar un titor")
    @DeleteMapping("/titor/{id}")
    public ResponseEntity<Void> eliminarPersoa(@PathVariable Long id) {
        if (titorRepository.existsById(id)) {
            titorRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}