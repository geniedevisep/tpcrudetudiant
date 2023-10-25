package sn.isepdiamniadio.edu.sn.GestionEtudian.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.isepdiamniadio.edu.sn.GestionEtudian.repository.EtudiantRepositoryImpl;

import java.util.List;

@RestController
@RequestMapping("/api/etudiant")
public class EtudiantController {
    @Autowired
    private EtudiantRepositoryImpl etudiantRepository;
    @GetMapping
    public List<Etudiant> getEtudiants() {
        return etudiantRepository.getEtudiants();
    }

    @GetMapping("/{id}")
    public Etudiant getEtudiant(@PathVariable Long id) {
        return etudiantRepository.getEtudiant(id);
    }

    @PostMapping
    public Etudiant ajouterEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantRepository.ajouterEtudiant(etudiant);
    }

    @PutMapping("/{id}")
    public Etudiant mettreAjourEtudiant(@PathVariable Long id, @RequestBody Etudiant etudiantMaj) {
        return etudiantRepository.mettreAjourEtudiant(id, etudiantMaj);
    }

    @DeleteMapping("/{id}")
    public void supprimerEtudiant(@PathVariable Long id) {
        etudiantRepository.supprimerEtudiant(id);
    }

}
