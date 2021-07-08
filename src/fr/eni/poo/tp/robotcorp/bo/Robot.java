package fr.eni.poo.tp.robotcorp.bo;

public class Robot {

	private String modele;
	public String couleur;
	int versionIA;
	
	public Robot(String modele,String couleur,int versionIA){
		this.modele=modele;
		this.couleur=couleur;
		this.versionIA=versionIA;
	}

	public String getModele(){
	return this.modele;	
	}
	
	public String getCouleur(){
		return this.couleur;	
	}
	
	public int getVersionIA(){
		return this.versionIA;
	}
	
	private void setModele(String modele){//Private ne permet que l'utilisation dans la classe
		this.modele=modele;
	}

	public void setVersionIA(int versionIA){
		this.versionIA=versionIA;
	}
	
	 public void affficherInfos(){
		System.out.println("Le robot a pour modèle "+getModele()+" pour couleur "+getCouleur()+" et pour version d'IA "+getVersionIA());
	}
	 



}
