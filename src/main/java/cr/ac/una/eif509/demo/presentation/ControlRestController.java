package cr.ac.una.eif509.demo.presentation;

import cr.ac.una.eif509.demo.data.AnimalRepository;
import cr.ac.una.eif509.demo.data.LoteRepository;
import cr.ac.una.eif509.demo.domain.AnimalEntity;
import cr.ac.una.eif509.demo.domain.LoteEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ControlRestController {

    private final LoteRepository loteRepository;
    private final AnimalRepository animalRepository;

    public ControlRestController(LoteRepository loteRepository, AnimalRepository animalRepository) {
        this.loteRepository = loteRepository;
        this.animalRepository = animalRepository;
    }

    @GetMapping("/lotes")
    public List<LoteEntity> listarLotes() {
        return loteRepository.findAll();
    }

    @PostMapping("/lotes")
    public ResponseEntity<LoteEntity> crearLote(@RequestBody LoteEntity lote) {
        return ResponseEntity.ok(loteRepository.save(lote));
    }

    @GetMapping("/animales")
    public List<AnimalEntity> listarAnimales() {
        return animalRepository.findAll();
    }

    @PostMapping("/animales")
    public ResponseEntity<AnimalEntity> crearAnimal(@RequestBody AnimalEntity animal) {
        return ResponseEntity.ok(animalRepository.save(animal));
    }
}
