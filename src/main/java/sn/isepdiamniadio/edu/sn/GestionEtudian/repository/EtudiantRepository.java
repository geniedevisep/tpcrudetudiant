package sn.isepdiamniadio.edu.sn.GestionEtudian.repository;


import org.springframework.stereotype.Repository;
import sn.isepdiamniadio.edu.sn.GestionEtudian.model.Etudiant;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface EtudiantRepository   {

    public List<Etudiant> etudiants = new ArrayList<>();

    public List<Etudiant> getEtudiants() ;



    public Etudiant getEtudiant(Long id) ;


    public Etudiant ajouterEtudiant(Etudiant etudiant) ;


    public Etudiant mettreAjourEtudiant(Long id, Etudiant etudiantMaj) ;


    public void supprimerEtudiant(Long id) ;


}

