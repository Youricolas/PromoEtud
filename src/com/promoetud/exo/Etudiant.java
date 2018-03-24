package com.promoetud.exo;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * Class qui représente un etudiant
 * @author Youri
 *
 */
public class Etudiant {
	
	private static float moyenne;
	private String nom;
	private  String prenom;
	private int age;
	private char sexe;
	private ArrayList<Float> notes;
	
	public Etudiant(String nom, String prenom, int age, char sexe) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.sexe = sexe;
		this.notes = new ArrayList<Float>();
	}
	
	public void addNote(float note) {
		notes.add(note);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSexe() {
		return sexe;
	}

	public void setSexe(char sexe) {
		this.sexe = sexe;
	}

	public ArrayList<Float> getNotes() {
		return notes;
	}

	public void setNotes(ArrayList<Float> notes) {
		this.notes = notes;
	}

	public float getMoyenne() {
		moyenne = 0;
		notes.forEach((item)->moyenne = moyenne + item);
		moyenne = moyenne/notes.size();
		return moyenne;
	}
	
	public static Etudiant saisieEtudiant(Scanner sc) {
		System.out.println("Sasir Nom : ");
		String nom = sc.nextLine();
		System.out.println("Sasir Prénom : ");
		String prenom = sc.nextLine();
		System.out.println("Sasir Age: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Sasir Sexe : ");
		char sexe = sc.nextLine().charAt(0);
		return  new Etudiant(nom, prenom, age, sexe);
	}
	
	public boolean equals(Etudiant e) {
		return (this.age == e.age && this.nom.equals(e.getNom()) && this.prenom.equals(e.prenom) && e.sexe == this.sexe);
	}
}
