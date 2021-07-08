package fr.eni.poo.tp.robotcorp.application;

import fr.eni.poo.tp.robotcorp.bo.Robot;

public class TestRobot {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Robot roby= new Robot("T1000","Argent",42); 
		 //pensée objet:le programme interroge l'objet robby pour afficher l'information il n'a aucun contrôle sur ce qu'il fait de l'ordre
		 roby.affficherInfos();
		 //pensée procédurale: le programme utilise roby pour réaliser l'afficher de l'information. 
		 afficherInfos(roby);
		 roby.couleur="Vert";
		 roby.affficherInfos();
		 roby.setVersionIA(65);
		 roby.affficherInfos();
		 //roby.versionIA=89;//On ne peut pas car versionIA ne peut être utilisé que par des classes appartenant au même package
		 //Or ici Les classes Robot et TestRobot sont dans 2 packages différents fr.eni.poo.tp.robotcorp.application et fr.eni.poo.tp.robotcorp.bo
	 
	}
	  public static void afficherInfos(Robot leRobot){
			 System.out.println("Le robot a pour modèle "+leRobot.getModele());
		 }
}
