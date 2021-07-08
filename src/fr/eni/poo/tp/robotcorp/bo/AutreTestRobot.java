package fr.eni.poo.tp.robotcorp.bo;

public class AutreTestRobot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot robotnic= new Robot("V4575","Brun",59);
		robotnic.affficherInfos();		
		robotnic.versionIA=56;//On  peut car versionIA peut être utilisée par des classes appartenant au même package 
							//comme ici Robot où a été créé versionIA et TestRobot qui sont tout 2 dans fr.eni.poo.tp.robotcorp.bo
		robotnic.affficherInfos();
	}

}
