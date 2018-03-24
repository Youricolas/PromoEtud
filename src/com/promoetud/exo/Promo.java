package com.promoetud.exo;

import java.util.ArrayList;
import java.util.Scanner;

public class Promo {
	protected static float moyenne;
	private String nom;
	private int annee;
	private ArrayList<Etudiant> liste = new ArrayList<Etudiant>();
	
	public Promo() {
		liste.clear();
	}
	
	public void add(Etudiant edd) {
		liste.add(edd);
	}

	public void delete(Etudiant edd) {
		liste.remove(liste.indexOf(edd));
	}

	
	public ArrayList<Etudiant> getListe() {
		return liste;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public void setListe(ArrayList<Etudiant> liste) {
		this.liste = liste;
	}
	
	public int afficherMenuPromotion(Scanner sc) {
		System.out.println("1 : Ajouter Etudiant");
		System.out.println("2 : Supprimer Etudiant");
		System.out.println("3 : Rechercher Etudiant");
		System.out.println("4 : Afficher moyenne promo");
		System.out.println("5 : Sortir du programme");
		int choix = sc.nextInt();
		sc.nextLine();
		return choix;
	}
	


	public void ajoutEtudiant(Scanner sc) {
		System.out.println("****** Ajouter Etudiant ******");
		Etudiant e = Etudiant.saisieEtudiant(sc);
		this.liste.add(e);
	}
	
	public Etudiant findEtudiant(Etudiant e ) {
		for (Etudiant etudiant : liste) {
			if(e.equals(etudiant)) return etudiant;
		}
		return null;
	}
	
	public void supEtudiant(Scanner sc) {
		Etudiant e = Etudiant.saisieEtudiant(sc);
		Etudiant edutiantFound = findEtudiant(e);
		if(edutiantFound  != null) {
			this.liste.remove(edutiantFound);
			System.out.println("Etudiant bien supprimé");
		}else {
			System.out.println("Etudiant pas trouvé");
		}
	}
	public void MoyenneEtudiant(Scanner sc) {
	
}

	public float getMoyenne1(Scanner sc) {
		moyenne = 0;
		for (Etudiant etudiant : this.liste) {
			moyenne += etudiant.getMoyenne();
		}
		moyenne = moyenne/liste.size();
		return moyenne;
		
	}
}
