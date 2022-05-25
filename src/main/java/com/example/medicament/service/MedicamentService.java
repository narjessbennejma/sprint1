package com.example.medicament.service;

import java.util.List;

import org.springframework.data.domain.Page;


import com.example.medicament.entities.Forme;
import com.example.medicament.entities.Medicament;

public interface MedicamentService  {
   
	Medicament saveMedicament(Medicament m);
	Medicament updateMedicament(Medicament m);
	void deleteMedicament(Medicament m);
	 void deleteMedicamentById(Long id);
	 Medicament getMedicament(Long id);
	List<Medicament> getAllMedicaments();
	Page<Medicament> getAllMedicamentsParPage(int page, int size);
	List<Medicament> findByNomMedicament(String nom);
		 List<Medicament> findByNomMedicamentContains(String nom);
		 List<Medicament> findByNomPrix (String nom, Double prix);
		 List<Medicament> findByForme (Forme forme);
		 List<Medicament> findByFormeIdForme(Long id);
		 List<Medicament> findByOrderByNomMedicamentAsc();
		 List<Medicament> trierMedicamentsNomsPrix();

}
