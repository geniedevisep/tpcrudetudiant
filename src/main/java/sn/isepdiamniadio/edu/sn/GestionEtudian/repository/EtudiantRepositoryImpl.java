package sn.isepdiamniadio.edu.sn.GestionEtudian.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.isepdiamniadio.edu.sn.GestionEtudian.model.Etudiant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EtudiantRepositoryImpl implements EtudiantRepository{
    public static List<Etudiant> etudiantList = new ArrayList<>();

    // Initialisation statique de la liste d'étudiants
    static {
        etudiantList.add(new Etudiant(1L, "astou", "niass", "keur madiabel"));
        etudiantList.add(new Etudiant(2L, "fatima", "kanoute", "keur massar"));
        etudiantList.add(new Etudiant(3L, "amina", "goudiaby", "keur massar"));
        etudiantList.add(new Etudiant(4L, "soukaye", "leye", "colobane"));
        etudiantList.add(new Etudiant(5L, "cheikh", "ndao", "comico"));
    }
    @Override
    public List<Etudiant> getEtudiants() {
        return etudiantList;
    }
@Override
    public Etudiant getEtudiant(Long id) {
        for (Etudiant etudiant : etudiantList) {
            if (etudiant.getId().equals(id)) {
                return etudiant;
            }
        }
        return null;
    }
@Override
    public Etudiant ajouterEtudiant(Etudiant etudiant) {
        etudiantList.add(etudiant);
        return etudiant;
    }
@Override
    public Etudiant mettreAjourEtudiant(Long id, Etudiant etudiantMaj) {
        for (int i = 0; i < etudiantList.size(); i++) {
            Etudiant etudiant = etudiantList.get(i);
            if (etudiant.getId().equals(id)) {
                etudiantMaj.setId(id);
                etudiantList.set(i, etudiantMaj);
                return etudiantMaj;
            }
        }
        return null;
    }
@Override
    public void supprimerEtudiant(Long id) {
        etudiantList.removeIf(etudiant -> etudiant.getId().equals(id));
    }


}



