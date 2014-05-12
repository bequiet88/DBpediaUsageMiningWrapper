package de.unimannheim.dws;

import de.unimannheim.dws.controller.MainController;

public class DBpediaUsageMiningWrapper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Java main calling Scala main");
		MainController.main(new String[] { "" }); // SMain.main is the actual *main*

	}

}
