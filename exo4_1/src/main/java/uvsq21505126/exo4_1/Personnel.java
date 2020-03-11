package uvsq21505126.exo4_1;

import java.time.LocalDateTime;
import java.util.*;

public class Personnel implements Groupe{
	private final String nom;
	private final String prenom;
	private final String fonction;
	private final LocalDateTime date;
	private final List<String> num_tel;
	
	public static class Builder{
		private final String nom;
		private final String prenom;
		private final String fonction;
		private final LocalDateTime date;
		private final List<String> num_tel;
	
	public Builder(String nom, String prenom, String fonction, LocalDateTime date, List<String> num_tel) {
		this.nom = nom;
		this.prenom = prenom;
		this.fonction = fonction;
		this.date = date;
		this.num_tel = num_tel;
	}
	
	public Personnel build() {
		return new Personnel(this);
	}
}
	
	private Personnel(Builder builder) {
		this.nom = builder.nom;
		this.prenom = builder.prenom;
		this.fonction = builder.fonction;
		this.date = builder.date;
		this.num_tel = builder.num_tel;
	}

	public void print() {
		System.out.println("Personnel");
		
	}
}