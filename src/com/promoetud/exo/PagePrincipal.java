package com.promoetud.exo;

import java.util.Scanner;

public class PagePrincipal {
	public static final int CHOIX_AJOUT_ETUDIANT = 1;
	public static final int CHOIX_SUP_ETUDIANT = 2;
	public static final int CHOIX_RECHERCHER_ETUDIANT_PROMO = 3;
	public static final int CHOIX_AFFICHER_MOYENNE_PROMO = 4;
	public static final int CHOIX_QUITTER = 5;


	static Promo promotion = new Promo();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir le nom de la promotion : ");
		promotion.setNom(sc.nextLine());
		System.out.println("Saisir l'année de la promotion : ");
		promotion.setAnnee(sc.nextInt());
		sc.nextLine();
		int choixMenu = -1;
		while (choixMenu != CHOIX_QUITTER) {
			choixMenu = promotion.afficherMenuPromotion(sc);
			switch(choixMenu) {
			case CHOIX_AJOUT_ETUDIANT : 
				promotion.ajoutEtudiant(sc);
				break;
			case CHOIX_SUP_ETUDIANT : 
				promotion.supEtudiant(sc);
				break;
			case CHOIX_RECHERCHER_ETUDIANT_PROMO : 
				Etudiant etudiantFound = promotion.findEtudiant(Etudiant.saisieEtudiant(sc));
				if(etudiantFound != null) {
					System.out.println("Etudiant trouvé ");
				}else {
					System.out.println("Etudiant pas trouvé ");
				}
				break;
			case CHOIX_AFFICHER_MOYENNE_PROMO :
				promotion.getMoyenne1(sc);
				break;
			default: 
				System.out.println("Erreur de saisie");
				break;
			}
		}
	}
}